package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.ClassInsn;

import java.util.ArrayList;

public class ClassStat extends Statement {
    private String NAME;
    private ArrayList<Statement> BODY;
    private ArrayList<String> INHERITANCE;

    public ClassStat(int line, String name, ArrayList<Statement> body, ArrayList<String> inheritance) {
        super(line, Statements.CLASS);
        NameUtils.throwIfInvalid(name);
        NAME = name;
        BODY = body;
        INHERITANCE = inheritance;
    }

    @Override
    public void compile(Builder builder) {
        builder.emit(new ClassInsn(NAME, INHERITANCE, BODY));
    }
}
