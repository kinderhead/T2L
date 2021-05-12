package io.github.kinderhead.T2L.execution.errors;

import io.github.kinderhead.T2L.execution.T2LTypes;

public class ValueMissingException extends T2LException {
    public ValueMissingException() {
        TYPE = T2LTypes.CUSTOM;
        PREFIX = "ValueMissingException: ";
        NAME = "ValueMissingException";
    }
}
