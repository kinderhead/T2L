package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.execution.*;
import io.github.kinderhead.T2L.execution.errors.ValueMissingException;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Instruction {
    private int NUMBER;

    public abstract void serialize(Builder builder);
    public abstract void deserialize(Reader reader);

    public abstract void execute(Executor executor);

    public abstract OpCodes getOpcode();

    public int getNumber() {
        return NUMBER;
    }

    public void setNumber(int num) {
        NUMBER = num;
    }

    public static T2LObject environmentGetErrorHandler(int env, String name, Executor executor) {
        T2LObject out = executor.ENVIRONMENT.get(env, name);
        if (out == null) {
            if (!name.contains("_intern_value_v")) {
                new ValueMissingException().raise("Cannot find variable \"" + name + "\"", executor.CURRENT_LINE);
            } else {
                ArrayList<String> nname = new ArrayList<>(Arrays.asList(name.split("\\.")));
                T2LObject from_obj = executor.ENVIRONMENT.get(env, nname.get(0));
                nname.remove(0);
                new ValueMissingException().raise("Cannot find property with name \"" + String.join(".", nname) + "\" from object " + from_obj.getString(executor), executor.CURRENT_LINE);
            }
        }
        return out;
    }

    public Instruction() {

    }
}
