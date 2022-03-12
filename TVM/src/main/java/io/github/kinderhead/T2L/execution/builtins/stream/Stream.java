package io.github.kinderhead.T2L.execution.builtins.stream;

import io.github.kinderhead.T2L.execution.T2LObject;

import java.io.PrintStream;

public class Stream extends T2LObject {
    public PrintStream stream = null;

    public Stream() {
        stream = System.out;
    }
}
