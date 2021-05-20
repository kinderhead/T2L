package io.github.kinderhead.T2L.execution.builtins.modules;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.T2LModule;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.builtins.T2LAsObject;
import io.github.kinderhead.T2L.execution.builtins.T2LFunction;

import java.util.Arrays;

public class JavaModule extends T2LModule {
    @Override
    public String getName() {
        return "java";
    }

    public void from(String... name) {
        System.out.println(Arrays.toString(name));
    }

    @T2LFunction
    @T2LAsObject
    public Object[] asArray(Executor executor, T2LObject obj) {
        return obj.getIterable(executor).toArray();
    }
}
