package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.Visitor;
import io.github.kinderhead.T2L.execution.T2LError;

public class NameUtils {
    public static void throwIfInvalid(String name) {
        if (isInvalid(name)) {
            new T2LError(name + " cannot be used in this context", Visitor.LINE, "NameException").runWithoutFail();
        }
    }

    public static boolean isInvalid(String name) {
        return name.contains(".") || isInteger(name.split("")[0]);
    }

    public static boolean isInteger(String s) {
        return s.matches("-?\\d+");
    }
}
