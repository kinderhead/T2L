package io.github.kinderhead.T2L.execution.errors;

import io.github.kinderhead.T2L.execution.T2LTypes;

public class IndexOutOfBoundsException extends T2LException {
    public IndexOutOfBoundsException() {
        NAME = "IndexOutOfBoundsException";
        TYPE = T2LTypes.CUSTOM;
        PREFIX = "IndexOutOfBoundsException: ";
    }
}
