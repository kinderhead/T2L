package io.github.kinderhead.T2L.execution.errors;

import io.github.kinderhead.T2L.execution.T2LTypes;

public class OperationDisabledException extends T2LException {
    public OperationDisabledException() {
        TYPE = T2LTypes.CUSTOM;
        PREFIX = "OperationDisabledException: ";
        NAME = "OperationDisabledException";
    }
}
