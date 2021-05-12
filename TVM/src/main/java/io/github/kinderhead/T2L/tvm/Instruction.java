package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.execution.*;
import io.github.kinderhead.T2L.execution.errors.ValueMissingException;

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
            new ValueMissingException().raise("Cannot find variable \"" + name + "\"", executor.CURRENT_LINE);
        }
        return out;
    }

    public Instruction() {

    }
}
