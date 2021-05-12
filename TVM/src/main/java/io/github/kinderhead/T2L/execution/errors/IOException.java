package io.github.kinderhead.T2L.execution.errors;

import io.github.kinderhead.T2L.execution.T2LTypes;

public class IOException extends T2LException {
    public IOException() {
        NAME = "IOException";
        TYPE = T2LTypes.CUSTOM;
        PREFIX = "IOException: ";
    }
}
