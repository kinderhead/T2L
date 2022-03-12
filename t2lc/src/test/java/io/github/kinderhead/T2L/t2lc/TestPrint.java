package io.github.kinderhead.T2L.t2lc;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestPrint extends PrintStream {
    /**
     * Don't bother with this constructor.
     *
     * @param ignore Ignored
     * @throws FileNotFoundException Don't worry about it
     */
    @Deprecated public TestPrint(String ignore) throws FileNotFoundException {
        super("");
    }

    public TestPrint() {
        super();
        System.setOut();
    }
}
