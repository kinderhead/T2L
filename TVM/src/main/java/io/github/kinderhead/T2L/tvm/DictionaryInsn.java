package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.JavaInterface;
import io.github.kinderhead.T2L.execution.Reader;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.builtins.T2LDictionary;

import java.util.ArrayList;

public class DictionaryInsn extends Instruction implements PassableInstruction {
    private int SIZE;

    public DictionaryInsn() {

    }

    public DictionaryInsn(int size) {
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
        return OpCodes.DICT;
    }

    @Override
    public T2LObject getValue(Executor executor) {
        T2LObject right = executor.ENVIRONMENT.pop();
        T2LObject left = executor.ENVIRONMENT.pop();

        return new JavaInterface(new T2LDictionary(new ArrayList<>(left.getIterable(executor)), new ArrayList<>(right.getIterable(executor)), executor), null);
    }
}
