package io.github.kinderhead.T2L.execution.builtins;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.T2LTypes;

public class Bool extends T2LObject {
    public Bool(boolean bool) {
        TYPE = T2LTypes.INT;
        NUMBER = ((bool) ? 1 : 0);
        NAME = "boolean";
    }

    @Override
    public boolean isTrue() {
        return NUMBER == 1;
    }

    @Override
    public String getString(Executor executor) {
        return (NUMBER == 1) ? "true" : "false";
    }
}
