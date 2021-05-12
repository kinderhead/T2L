package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Reader;
import io.github.kinderhead.T2L.execution.T2LObject;

public class IDInsn extends Instruction implements PassableInstruction{
    private String NAME;

    public IDInsn() {

    }

    public IDInsn(String name) {
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

    }

    @Override
    public OpCodes getOpcode() {
        return OpCodes.ID;
    }

    @Override
    public T2LObject getValue(Executor executor) {
        return environmentGetErrorHandler(executor.CURRENT_ENVIRONMENT, NAME, executor);
    }
}
