package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.ElseIfInsn;

import java.util.ArrayList;

public class ElseIfStat extends Statement {
    private final ArrayList<Statement> BODY;
    private final IVisitorAST EXPR;

    public ElseIfStat(int line, ArrayList<Statement> body, IVisitorAST expr) {
        super(line, Statements.IF);
        BODY = body;
        EXPR = expr;
    }

    @Override
    public void compile(Builder builder) {
        builder.emit(new ElseIfInsn(BODY, EXPR));
    }
}
