package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.ast.Statement;
import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Function;
import io.github.kinderhead.T2L.execution.Reader;

import java.util.ArrayList;

public class FuncInsn extends Instruction {
    private String NAME;
    private ArrayList<String> PARAMS;
    private ArrayList<Statement> BODY;
    private ArrayList<Instruction> INSNS;

    public FuncInsn() {

    }

    public FuncInsn(String name, ArrayList<String> params, ArrayList<Statement> body) {
        NAME = name;
        PARAMS = params;
        BODY = body;
    }

    @Override
    public void serialize(Builder builder) {
        builder.emit(NAME);
        builder.emitStringArray(PARAMS);
        builder.emitStatementArray(BODY);
    }

    @Override
    public void deserialize(Reader reader) {
        NAME = reader.getString();
        PARAMS = reader.getStrings();
        INSNS = reader.getInsns();
    }

    @Override
    public void execute(Executor executor) {
        Function out = new Function(executor.CURRENT_ENVIRONMENT);
        out.CODE = INSNS;
        out.PARAMS = PARAMS;
        out.NAME = NAME;
        executor.ENVIRONMENT.set(executor.CURRENT_ENVIRONMENT, NAME, out, executor);
    }

    @Override
    public OpCodes getOpcode() {
        return OpCodes.DEF;
    }
}
