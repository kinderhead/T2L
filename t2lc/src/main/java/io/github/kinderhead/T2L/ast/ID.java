package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.IDInsn;
import io.github.kinderhead.T2L.tvm.PushInsn;

public class ID implements IVisitorAST, PropertyGetterAST {
    private int LINE;
    public String NAME;

    @Override
    public int getLine() {
        return LINE;
    }

    @Override
    public Statements getType() {
        return null;
    }

    @Override
    public void compile(Builder builder) {
        builder.emit(new PushInsn(new IDInsn(NAME)));
    }

    public ID(int line, String name) {
        LINE = line;
        NAME = name;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void setName(String name) {
        NAME = name;
    }
}
