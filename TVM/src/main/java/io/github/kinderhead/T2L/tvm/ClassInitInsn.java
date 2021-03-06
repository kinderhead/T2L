package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.JavaClassInterface;
import io.github.kinderhead.T2L.execution.Reader;
import io.github.kinderhead.T2L.execution.T2LClass;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.errors.ClassInitException;

import java.util.ArrayList;
import java.util.Collections;

public class ClassInitInsn extends Instruction implements PassableInstruction {
    private String NAME;
    private int SIZE;

    public ClassInitInsn() {

    }

    public ClassInitInsn(String name, int size) {
        NAME = name;
        SIZE = size;
    }

    @Override
    public void serialize(Builder builder) {
        builder.emit(NAME);
        builder.emit(SIZE);
    }

    @Override
    public void deserialize(Reader reader) {
        NAME = reader.getString();
        SIZE = (int) reader.getInt();
    }

    @Override
    public void execute(Executor executor) {
        executor.ENVIRONMENT.push(getValue(executor));
    }

    @Override
    public OpCodes getOpcode() {
        return OpCodes.INIT;
    }

    @Override
    public T2LObject getValue(Executor executor) {
        ArrayList<T2LObject> objs = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            objs.add(executor.ENVIRONMENT.pop());
        }
        Collections.reverse(objs);

        T2LObject obj = Instruction.environmentGetErrorHandler(executor.CURRENT_ENVIRONMENT, NAME, executor);
        if (obj instanceof T2LClass) {
            return ((T2LClass) obj).instantiate(objs, NAME, executor.CURRENT_ENVIRONMENT, executor);
        } else if (obj instanceof JavaClassInterface) {
            return ((JavaClassInterface) obj).instantiate(objs, NAME, executor.CURRENT_ENVIRONMENT, executor);
        } else {
            new ClassInitException().raise("Cannot instantiate non class variable " + NAME);
        }

        return null;
    }
}
