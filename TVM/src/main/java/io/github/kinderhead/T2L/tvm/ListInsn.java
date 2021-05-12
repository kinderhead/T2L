package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.JavaInterface;
import io.github.kinderhead.T2L.execution.Reader;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.builtins.T2LList;

import java.util.ArrayList;
import java.util.Collections;

public class ListInsn extends Instruction implements PassableInstruction {
    private int SIZE;

    public ListInsn() {

    }

    public ListInsn(int size) {
        SIZE = size;
    }

    @Override
    public void serialize(Builder builder) {
        builder.emit(SIZE);
    }

    @Override
    public void deserialize(Reader reader) {
        SIZE = (int) reader.getInt();
    }

    @Override
    public void execute(Executor executor) {
        executor.ENVIRONMENT.push(getValue(executor));
    }

    @Override
    public OpCodes getOpcode() {
        return OpCodes.LIST;
    }

    @Override
    public T2LObject getValue(Executor executor) {
        ArrayList<T2LObject> objs = new ArrayList<>();

        for (int i = 0; i < SIZE; i++) {
            objs.add(executor.ENVIRONMENT.pop());
        }
        Collections.reverse(objs);

        return new JavaInterface(new T2LList(objs), null);
    }
}
