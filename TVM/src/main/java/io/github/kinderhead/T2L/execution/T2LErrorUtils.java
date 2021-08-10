package io.github.kinderhead.T2L.execution;

import io.github.kinderhead.T2L.execution.errors.TypeException;

public class T2LErrorUtils {
    public static void assertString(T2LObject obj, Executor executor) {
        if (obj.TYPE != T2LTypes.STRING) {
            new TypeException().raise("Object " + obj.getString(executor) + " must be a string", executor.CURRENT_LINE);
        }
    }
}
