package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.ReturnInsn;

public class ReturnStat extends Statement {
    private IVisitorAST RET;

    public ReturnStat(int line, IVisitorAST ret) {
        super(line, Statements.RETURN);
        RET = ret;
    }

    @Override
    public void compile(Builder builder) {
        builder.addLine(getLine());
        RET.compile(builder);
        builder.emit(new ReturnInsn(true));
    }
}
