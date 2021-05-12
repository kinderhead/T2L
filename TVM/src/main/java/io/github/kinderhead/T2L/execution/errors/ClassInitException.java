package io.github.kinderhead.T2L.execution.errors;

import io.github.kinderhead.T2L.execution.T2LTypes;

public class ClassInitException extends T2LException {
    public ClassInitException() {
        NAME = "ClassInitException";
        TYPE = T2LTypes.CUSTOM;
        PREFIX = "ClassInitException: ";
    }
}
