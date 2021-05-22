package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.IfInsn;

import java.util.ArrayList;

public class IfStatement extends Statement {
    private final IVisitorAST EXPR;
    private final ArrayList<Statement> BODY;
    private final ArrayList<Statement> ELSE;
    private final ArrayList<ElseIfStat> ELSE_IF;

    public IfStatement(int line, IVisitorAST expr, ArrayList<Statement> body, ArrayList<Statement> else_stat, ArrayList<ElseIfStat> elseif) {
        super(line, Statements.IF);
        EXPR = expr;
        BODY = body;
        ELSE = else_stat;
        ELSE_IF = elseif;
    }

    @Override
    public void compile(Builder builder) {
        builder.addLine(getLine());
        EXPR.compile(builder);
        builder.emit(new IfInsn(BODY, ELSE, ELSE_IF));
    }
}
