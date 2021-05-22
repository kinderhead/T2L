package io.github.kinderhead.T2L.execution.errors;

import io.github.kinderhead.T2L.execution.T2LError;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.T2LTypes;

/**
 * Baseclass for all exceptions. See any class in the <code>errors</code>
 * package for examples.
 * To catch this error, catch {@link T2LError} instead.
 *
 * @see T2LError
 */
public class T2LException extends T2LObject {
    public String PREFIX = "Exception: ";

    /**
     * Raise the error with line.
     *
     * @param msg The message
     * @param line The line
     */
    public void raise(String msg, int line) {
        new T2LError(PREFIX + msg, line, NAME).run();
    }

    /**
     * Raise the error.
     *
     * @param msg The message
     */
    public void raise(String msg) {
        new T2LError(PREFIX + msg).run();
    }

    /**
     * Create the exception.
     */
    public T2LException() {
        TYPE = T2LTypes.CUSTOM;
        NAME = "Exception";
    }

    /**
     * Clone the object.
     *
     * @return The clone
     */
    @Override
    public T2LObject clone() {
        T2LException obj = (T2LException) super.clone();
        obj.PREFIX = PREFIX;
        return obj;
    }
}
