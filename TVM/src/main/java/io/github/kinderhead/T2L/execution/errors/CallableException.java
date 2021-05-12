package io.github.kinderhead.T2L.execution.errors;

import io.github.kinderhead.T2L.execution.T2LTypes;

public class CallableException extends T2LException {
    public CallableException() {
        TYPE = T2LTypes.CUSTOM;
        NAME = "CallableException";
        PREFIX = "CallableException: ";
    }
}
