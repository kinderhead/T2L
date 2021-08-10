package io.github.kinderhead.T2L.execution.builtins;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Function;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.T2LObjectFactory;

import java.util.List;

public class Help extends Function {
    public Help(int i) {
        super(i);
        NAME = "help";
        PARAMS.add("obj");
    }

    @Override
    public T2LObject run(T2LObject obj, List<T2LObject> params, Executor executor) {
        T2LObject param = params.get(0);
        String out;
        if (param.rawContains("__doc")) {
            out = param.get("__doc").getString(executor);
        } else {
            out = "";
        }
        return T2LObjectFactory.createString(out);
    }
}
