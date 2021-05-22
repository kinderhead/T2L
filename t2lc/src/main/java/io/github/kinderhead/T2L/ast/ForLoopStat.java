package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.ForLoopInsn;

import java.util.ArrayList;

public class ForLoopStat extends Statement {
    private String NAME;
    private IVisitorAST EXPR;
    private ArrayList<Statement> BODY;

    public ForLoopStat(int line, String name, IVisitorAST expr, ArrayList<Statement> body) {
        super(line, Statements.FOR);
        NAME = name;
        EXPR = expr;
        BODY = body;
    }

    @Override
    public void compile(Builder builder) {
        builder.addLine(getLine());
        EXPR.compile(builder);
        builder.emit(new ForLoopInsn(NAME, BODY));
    }
}
