package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.ast.IVisitorAST;
import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Reader;

public class ReturnInsn extends Instruction {
    private boolean VALUE;

    public ReturnInsn() {

    }

    public ReturnInsn(boolean value) {
        VALUE = value;
    }

    @Override
    public void serialize(Builder builder) {
        builder.emit(VALUE);
    }

    @Override
    public void deserialize(Reader reader) {
        VALUE = reader.getBool();
    }

    @Override
    public void execute(Executor executor) {
        executor.RETURNING_VALUE = VALUE;
        executor.RETURNING = true;
    }

    @Override
    public OpCodes getOpcode() {
        return OpCodes.RETURN;
    }
}
