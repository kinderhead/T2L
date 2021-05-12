package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.ExprInsn;

public class ExprAST extends Statement {
    private IVisitorAST LEFT;
    private IVisitorAST RIGHT;
    private ExprCodes OP;

    public ExprAST(int line, IVisitorAST left, IVisitorAST right, ExprCodes op) {
        super(line, Statements.EXPR);
        RIGHT = right;
        LEFT = left;
        OP = op;
    }

    @Override
    public void compile(Builder builder) {
        RIGHT.compile(builder);
        LEFT.compile(builder);
        builder.emit(new ExprInsn(OP));
    }
}
