package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;

public class PairAST implements IVisitorAST {
    public int LINE;
    public IVisitorAST KEY;
    public IVisitorAST VALUE;

    public PairAST(int line, IVisitorAST key, IVisitorAST value) {
        LINE = line;
        KEY = key;
        VALUE = value;
    }

    @Override
    public int getLine() {
        return LINE;
    }

    @Override
    public Statements getType() {
        return Statements.PAIR;
    }

    @Override
    public void compile(Builder builder) {

    }
}
