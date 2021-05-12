package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Reader;

public class PopInsn extends Instruction {
    public PopInsn() {
    }

    @Override
    public void serialize(Builder builder) {

    }

    @Override
    public void deserialize(Reader reader) {

    }

    @Override
    public void execute(Executor executor) {
        executor.ENVIRONMENT.pop();
    }

    @Override
    public OpCodes getOpcode() {
        return OpCodes.POP;
    }
}
