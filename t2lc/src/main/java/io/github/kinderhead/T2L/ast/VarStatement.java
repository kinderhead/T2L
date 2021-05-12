package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.VarInsn;

public class VarStatement extends Statement {
    public ID ID;
    public IVisitorAST EXPR;

    public VarStatement(int line, ID id, IVisitorAST expr) {
        super(line, Statements.VAR);
        this.ID = id;
        EXPR = expr;
    }

    @Override
    public void compile(Builder builder) {
        EXPR.compile(builder);
        builder.emit(new VarInsn(this.ID.NAME));
    }
}
