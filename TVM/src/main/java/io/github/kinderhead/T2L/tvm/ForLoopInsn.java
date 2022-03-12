package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.ast.Statement;
import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Function;
import io.github.kinderhead.T2L.execution.Reader;
import io.github.kinderhead.T2L.execution.T2LObject;

import java.util.ArrayList;
import java.util.Collections;

public class ForLoopInsn extends Instruction {
    private String NAME;
    private ArrayList<Instruction> INSNS;
    private ArrayList<Statement> BODY;

    public ForLoopInsn() {

    }

    public ForLoopInsn(String name, ArrayList<Statement> body) {
        NAME = name;
        BODY = body;
    }

    @Override
    public void serialize(Builder builder) {
        builder.emit(NAME);
        builder.emitASTArray(BODY);
    }

    @Override
    public void deserialize(Reader reader) {
        NAME = reader.getString();
        INSNS = reader.getInsns();
    }

    @Override
    public void execute(Executor executor) {
        T2LObject expr = executor.ENVIRONMENT.pop();

        Function func = new Function(executor.CURRENT_ENVIRONMENT);
        func.CODE = INSNS;
        func.PARAMS = new ArrayList<>(Collections.singletonList(NAME));

        for (T2LObject i : expr.getIterable(executor)) {
            func.run(null, new ArrayList<>(Collections.singletonList(i)), executor);
        }
    }

    @Override
    public OpCodes getOpcode() {
        return OpCodes.FOR;
    }
}
