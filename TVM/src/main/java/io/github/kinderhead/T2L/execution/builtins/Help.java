package io.github.kinderhead.T2L.execution.builtins;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Function;
import io.github.kinderhead.T2L.execution.T2LObject;

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
        if (param.rawContains("__doc")) {
            System.out.println(param.get("__doc").getString(executor));
        } else {
            System.out.println("No documentation for object");
        }
        return new T2LObject();
    }
}
