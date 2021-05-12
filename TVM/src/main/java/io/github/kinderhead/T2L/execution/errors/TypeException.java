package io.github.kinderhead.T2L.execution.errors;

import io.github.kinderhead.T2L.execution.T2LTypes;

public class TypeException extends T2LException {
    public TypeException() {
        NAME = "TypeException";
        TYPE = T2LTypes.CUSTOM;
        PREFIX = "TypeException: ";
    }
}
