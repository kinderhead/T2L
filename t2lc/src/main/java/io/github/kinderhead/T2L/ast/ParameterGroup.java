package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;

import java.util.ArrayList;

public class ParameterGroup implements IVisitorAST{
    private int LINE = 0;

    public ArrayList<IVisitorAST> PARAMETERS;

    @Override
    public int getLine() {
        return LINE;
    }

    @Override
    public Statements getType() {
        return Statements.PARAMETERS;
    }

    @Override
    public void compile(Builder builder) {

    }

    public ParameterGroup(ArrayList<IVisitorAST> params) {
        PARAMETERS = params;
    }
}
