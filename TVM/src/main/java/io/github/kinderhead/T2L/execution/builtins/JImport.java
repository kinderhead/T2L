package io.github.kinderhead.T2L.execution.builtins;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Function;
import io.github.kinderhead.T2L.execution.T2LObject;

import java.util.List;

public class JImport extends Function {
    public JImport(int i) {
        super(i);
        NAME = "__jimport";
        PARAMS.add("file");
    }

    @Override
    public T2LObject run(T2LObject obj, List<T2LObject> params, Executor executor) {
        T2LObject file = params.get(0);

        executor.ENVIRONMENT.jImport(file.getString(executor), executor);

        return new T2LObject();
    }
}
