package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.execution.*;
import io.github.kinderhead.T2L.execution.errors.ValueMissingException;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The instruction that is serialized and deserialized
 * and added to the bytecode.
 * Also where the inner workings of the language occurs.
 * Must be added to {@link Reader#INSNS} inorder to work
 */
public abstract class Instruction {
    private int NUMBER;

    /**
     * Serialize all necessary parameters.
     *
     * @param builder The builder
     */
    public abstract void serialize(Builder builder);

    /**
     * Deserialize all necessary parameters.
     *
     * @param reader The reader
     */
    public abstract void deserialize(Reader reader);

    /**
     * Execute the instruction.
     *
     * @param executor Executor
     */
    public abstract void execute(Executor executor);

    /**
     * Get the opcode to identify in the bytecode.
     *
     * @return The opcode
     */
    public abstract OpCodes getOpcode();

    /**
     * Gets the instruction number.
     * Runtime only.
     *
     * @return The number
     */
    public int getNumber() {
        return NUMBER;
    }

    /**
     * Sets the instruction number.
     * Runtime only.
     *
     * @param num The number
     */
    public void setNumber(int num) {
        NUMBER = num;
    }

    /**
     * Gets an object from an environment
     * and throws an error if it doesn't exist.
     *
     * @param env The source env
     * @param name The name
     * @param executor Executor
     * @return The object
     */
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

    /**
     * Creates an empty instruction.
     * Must always declare. The {@link Reader} requires an empty constructor.
     *
     * @see Reader#getInsn()
     */
    public Instruction() {

    }
}
