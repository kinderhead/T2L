package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Reader;

public class VarInsn extends Instruction {
    private String NAME;

    public VarInsn() {

    }

    public VarInsn(String name) {
        NAME = name;
    }

    @Override
    public void serialize(Builder builder) {
        builder.emit(NAME);
    }

    @Override
    public void deserialize(Reader reader) {
        NAME = reader.getString();
    }

    @Override
    public void execute(Executor executor) {
        executor.ENVIRONMENT.set(executor.CURRENT_ENVIRONMENT, NAME, executor.ENVIRONMENT.pop(), executor);
    }

    @Override
    public OpCodes getOpcode() {
        return OpCodes.VAR;
    }
}
