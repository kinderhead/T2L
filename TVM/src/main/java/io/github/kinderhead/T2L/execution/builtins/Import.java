package io.github.kinderhead.T2L.execution.builtins;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Function;
import io.github.kinderhead.T2L.execution.T2LObject;

import java.util.List;

public class Import extends Function {
    public Import(int i) {
        super(i);
        NAME = "__import";
        PARAMS.add("file");
    }

    @Override
    public T2LObject run(T2LObject obj, List<T2LObject> params, Executor executor) {
        T2LObject file = params.get(0);
        return executor.ENVIRONMENT.importFile(file.getString(executor), executor);
    }
}
