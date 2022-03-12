package io.github.kinderhead.T2L.t2lc;

import java.util.ArrayList;

import io.github.kinderhead.T2L.execution.builtins.stream.Stream;

public class TestPrint extends Stream {
    public ArrayList<String> OUT;

    public TestPrint() {
        OUT = new ArrayList<>();
    }

    @Override
    public void print(String txt) {
        super.print(txt);
        OUT.add(txt);
    }
}
