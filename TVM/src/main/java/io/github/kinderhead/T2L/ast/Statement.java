package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;

public abstract class Statement implements IVisitorAST {
    public int LINE;
    private final Statements TYPE;

    @Override
    public int getLine() {
        return LINE;
    }

    @Override
    public Statements getType() {
        return TYPE;
    }

    @Override
    public abstract void compile(Builder builder);

    public Statement(int line, Statements type) {
        LINE = line;
        TYPE = type;
    }
}
