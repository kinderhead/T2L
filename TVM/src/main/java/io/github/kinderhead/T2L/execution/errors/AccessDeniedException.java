package io.github.kinderhead.T2L.execution.errors;

import io.github.kinderhead.T2L.execution.T2LTypes;

public class AccessDeniedException extends T2LException {
    public AccessDeniedException() {
        TYPE = T2LTypes.CUSTOM;
        NAME = "AccessDeniedException";
        PREFIX = "AccessDeniedException: ";
    }
}
