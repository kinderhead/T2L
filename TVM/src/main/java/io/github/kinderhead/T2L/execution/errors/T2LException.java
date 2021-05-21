package io.github.kinderhead.T2L.execution.errors;

import io.github.kinderhead.T2L.execution.T2LError;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.T2LTypes;

public class T2LException extends T2LObject {
    public String PREFIX = "Exception: ";

    public void raise(String msg, int line) {
        new T2LError(PREFIX + msg, line, NAME).run();
    }

    public void raise(String msg) {
        new T2LError(PREFIX + msg).run();
    }

    public T2LException() {
        TYPE = T2LTypes.CUSTOM;
        NAME = "Exception";
    }

    @Override
    public T2LObject clone() {
        T2LException obj = (T2LException) super.clone();
        obj.PREFIX = PREFIX;
        return obj;
    }
}
