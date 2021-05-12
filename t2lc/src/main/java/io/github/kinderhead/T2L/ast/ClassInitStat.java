package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.ClassInitInsn;

import java.util.ArrayList;

public class ClassInitStat extends Statement {
    private String NAME;
    private ArrayList<IVisitorAST> PARAMS;

    public ClassInitStat(int line, String name, ArrayList<IVisitorAST> params) {
        super(line, Statements.CLASS_INIT);
        NAME = name;
        PARAMS = params;
    }

    @Override
    public void compile(Builder builder) {
        for (IVisitorAST i : PARAMS) {
            i.compile(builder);
        }
        builder.emit(new ClassInitInsn(NAME, PARAMS.size()));
    }
}
