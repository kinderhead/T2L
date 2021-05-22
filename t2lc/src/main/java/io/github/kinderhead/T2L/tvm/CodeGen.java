package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.ast.Statement;
import io.github.kinderhead.T2L.ast.StatementGroup;

import java.util.ArrayList;

public class CodeGen {
    public Builder MAIN_BUILDER = new Builder();

    public CodeGen(StatementGroup code) {
        for (Statement stmt : code.STATEMENTS) {
            build(stmt);
        }
    }

    public void build(Statement stmt) {
        stmt.compile(MAIN_BUILDER);
    }

    public ArrayList<Byte> getCode() {
        MAIN_BUILDER.finish();
        return MAIN_BUILDER.CODE;
    }
}
