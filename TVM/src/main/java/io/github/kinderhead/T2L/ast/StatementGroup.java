package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;

import java.util.ArrayList;

public class StatementGroup implements IVisitorAST{
    public ArrayList<Statement> STATEMENTS;

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public Statements getType() {
        return Statements.GROUP;
    }

    @Override
    public void compile(Builder builder) {
        for (Statement i : STATEMENTS) {
            i.compile(builder);
        }
    }

    public StatementGroup(ArrayList<Statement> stmts) {
        STATEMENTS = stmts;
    }
}
