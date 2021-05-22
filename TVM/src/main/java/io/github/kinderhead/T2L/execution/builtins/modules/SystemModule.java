package io.github.kinderhead.T2L.execution.builtins.modules;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.T2LModule;
import io.github.kinderhead.T2L.execution.builtins.T2LFunction;

public class SystemModule extends T2LModule {
    @Override
    public String getName() {
        return "system";
    }

    @T2LFunction
    public Executor getExecutor(Executor executor) {
        return executor;
    }
}
