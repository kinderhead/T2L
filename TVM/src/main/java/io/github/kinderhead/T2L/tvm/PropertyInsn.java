package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Reader;
import io.github.kinderhead.T2L.execution.T2LObject;

public class PropertyInsn extends Instruction implements PassableInstruction {
    public PropertyInsn() {

    }

    public PropertyInsn(String name) {

    }

    @Override
    public void serialize(Builder builder) {

    }

    @Override
    public void deserialize(Reader reader) {

    }

    @Override
    public void execute(Executor executor) {

    }

    @Override
    public OpCodes getOpcode() {
        return null;
    }

    @Override
    public T2LObject getValue(Executor executor) {
        return null;
    }
}
