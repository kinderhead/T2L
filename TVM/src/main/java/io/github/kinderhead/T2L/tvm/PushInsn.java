package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Reader;

public class PushInsn extends Instruction {
    private PassableInstruction VALUE;

    public PushInsn() {

    }

    public PushInsn(PassableInstruction value) {
        VALUE = value;
    }

    @Override
    public void serialize(Builder builder) {
        builder.emit((Instruction) VALUE);
    }

    @Override
    public void deserialize(Reader reader) {
        VALUE = (PassableInstruction) reader.getInsn();
    }

    @Override
    public void execute(Executor executor) {
        executor.ENVIRONMENT.push(VALUE.getValue(executor));
    }

    @Override
    public OpCodes getOpcode() {
        return OpCodes.PUSH;
    }
}
