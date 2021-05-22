package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.FuncInsn;

import java.util.ArrayList;

public class FunctionDefStat extends Statement {
    private String NAME;
    private ParameterGroup PARAMS;
    private ArrayList<Statement> BODY;

    public FunctionDefStat(int line, ID name, ParameterGroup params, StatementGroup body) {
        super(line, Statements.FUNCTION_DEF);
        NAME = name.NAME;
        PARAMS = params;
        BODY = body.STATEMENTS;
        NameUtils.throwIfInvalid(name.NAME);
    }

    @Override
    public void compile(Builder builder) {
        builder.addLine(getLine());
        ArrayList<String> params = new ArrayList<>();

        for (IVisitorAST i : PARAMS.PARAMETERS) {
            params.add(((StringAST) i).VALUE);
        }

        builder.emit(new FuncInsn(NAME, params, BODY));
    }
}
