package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.ListInsn;
import io.github.kinderhead.T2L.tvm.PushInsn;

import java.util.ArrayList;

public class ListAST implements IVisitorAST {
    private int LINE;
    private ArrayList<IVisitorAST> PARAMS;

    public ListAST(int line, ArrayList<IVisitorAST> params) {
        LINE = line;
        PARAMS = params;
    }

    @Override
    public int getLine() {
        return LINE;
    }

    @Override
    public Statements getType() {
        return Statements.LIST;
    }

    @Override
    public void compile(Builder builder) {
        for (IVisitorAST i : PARAMS) {
            i.compile(builder);
        }
        builder.emit(new PushInsn(new ListInsn(PARAMS.size())));
    }
}
