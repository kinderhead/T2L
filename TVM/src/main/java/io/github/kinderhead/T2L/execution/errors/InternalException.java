package io.github.kinderhead.T2L.execution.errors;

import io.github.kinderhead.T2L.execution.T2LError;
import io.github.kinderhead.T2L.execution.T2LTypes;

public class InternalException extends T2LException {
    public final Throwable SOURCE;

    public InternalException(Throwable source) {
        NAME = "InternalException";
        TYPE = T2LTypes.CUSTOM;
        PREFIX = "InternalException: ";
        SOURCE = source;
    }

    @Override
    public void raise(String msg) {
        T2LError obj = new T2LError(PREFIX + msg);
        obj.SOURCE = SOURCE;
        obj.run();
    }

    @Override
    public void raise(String msg, int line) {
        T2LError obj = new T2LError(PREFIX + msg, line, NAME);
        obj.SOURCE = SOURCE;
        obj.run();
    }
}
