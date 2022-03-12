package io.github.kinderhead.T2L.execution.builtins.modules;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.T2LErrorUtils;
import io.github.kinderhead.T2L.execution.T2LModule;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.T2LObjectFactory;
import io.github.kinderhead.T2L.execution.builtins.T2LFunction;

import java.util.ArrayList;
import java.util.Arrays;

public class StringModule extends T2LModule {
    @Override
    public String getName() {
        return "string";
    }

    @T2LFunction
    public T2LObject split(Executor executor, T2LObject str, T2LObject regex) {
        T2LErrorUtils.assertString(str, executor);
        T2LErrorUtils.assertString(regex, executor);

        return T2LObjectFactory.arrayToList(new ArrayList<String>(Arrays.asList(str.STRING.split(regex.STRING))), String.class);
    }
}
