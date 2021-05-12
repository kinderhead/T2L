package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.PushInsn;
import io.github.kinderhead.T2L.tvm.ValueInsn;

public class StringAST implements IVisitorAST {
    private final int LINE;
    public String VALUE;

    @Override
    public int getLine() {
        return LINE;
    }

    @Override
    public Statements getType() {
        return Statements.VALUE;
    }

    @Override
    public void compile(Builder builder) {
        builder.emit(new PushInsn(new ValueInsn(VALUE)));
    }

    public StringAST(int line, String value) {
        LINE = line;
        VALUE = value;
    }
}
