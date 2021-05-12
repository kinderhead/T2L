package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.DictionaryInsn;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryAST implements IVisitorAST {
    private int LINE;
    private HashMap<IVisitorAST, IVisitorAST> DATA;

    public DictionaryAST(int line, HashMap<IVisitorAST, IVisitorAST> data) {
        LINE = line;
        DATA = data;
    }

    @Override
    public int getLine() {
        return LINE;
    }

    @Override
    public Statements getType() {
        return null;
    }

    @Override
    public void compile(Builder builder) {
        new ListAST(LINE, new ArrayList<>(DATA.keySet())).compile(builder);
        new ListAST(LINE, new ArrayList<>(DATA.values())).compile(builder);
        builder.emit(new DictionaryInsn(DATA.size()));
    }
}
