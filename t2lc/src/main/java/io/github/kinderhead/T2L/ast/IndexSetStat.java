package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.CallInsn;

import java.util.ArrayList;
import java.util.Arrays;

public class IndexSetStat extends Statement {
    private String NAME;
    private IVisitorAST EXPR1;
    private IVisitorAST EXPR2;

    public IndexSetStat(int line, ID name, IVisitorAST expr1, IVisitorAST expr2) {
        super(line, Statements.INDEX);
        NAME = name.NAME;
        EXPR1 = expr1;
        EXPR2 = expr2;
    }

    @Override
    public void compile(Builder builder) {
        builder.addLine(getLine());
        EXPR1.compile(builder);
        EXPR2.compile(builder);
        builder.emit(new CallInsn(NAME + ".__set", new ArrayList<>(Arrays.asList(EXPR1, EXPR2)), true));
    }
}
