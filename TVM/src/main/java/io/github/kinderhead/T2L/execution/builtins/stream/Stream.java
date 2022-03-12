package io.github.kinderhead.T2L.execution.builtins.stream;

import io.github.kinderhead.T2L.execution.T2LObject;

import java.io.PrintStream;

public class Stream extends T2LObject {
    public PrintStream stream = null;

    public Stream() {
        stream = System.out;
    }

    public void println(String txt) {
        stream.println(txt);
    }

    public void print(String txt) {
        stream.print(txt);
    }
}
