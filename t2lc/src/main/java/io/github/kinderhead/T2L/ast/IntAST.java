package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.PushInsn;
import io.github.kinderhead.T2L.tvm.ValueInsn;

public class IntAST implements IVisitorAST {
    private int LINE;
    public double VALUE;

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

    public IntAST(int line, double value) {
        LINE = line;
        VALUE = value;
    }

}
