package io.github.kinderhead.T2L.execution.errors;

import io.github.kinderhead.T2L.execution.T2LTypes;

public class ParameterException extends T2LException{
    public ParameterException() {
        TYPE = T2LTypes.CUSTOM;
        PREFIX = "ParameterException: ";
        NAME = "ParameterException";
    }
}
