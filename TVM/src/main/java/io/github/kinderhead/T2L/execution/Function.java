package io.github.kinderhead.T2L.execution;

import io.github.kinderhead.T2L.tvm.Instruction;

import java.util.List;

public class Function extends T2LObject {

    /**
     * Creates a function object.
     * @deprecated Creating a function without defining {@link Function#ENV} will cause environment stack issues.
     *  Use {@link Function#Function(int)} instead.
     */
    @Deprecated
    public Function() {
        TYPE = T2LTypes.FUNCTION;
    }

    public Function(int env) {
        TYPE = T2LTypes.FUNCTION;
        ENV = env;
        NAME = "function";
    }

    @Override
    public T2LObject run(T2LObject obj, List<T2LObject> params, Executor executor) {
        Executor new_executor = new Executor(executor.ENVIRONMENT, executor);
        new_executor.CURRENT_ENVIRONMENT = executor.ENVIRONMENT.newEnvironment(ENV);

        int idex = 0;
        for (String i : PARAMS) {
            new_executor.ENVIRONMENT.set(new_executor.CURRENT_ENVIRONMENT, i, params.get(idex), executor);
            idex++;
        }

        if (obj != null) {
            new_executor.ENVIRONMENT.set(new_executor.CURRENT_ENVIRONMENT, "this", obj, executor);
        }

        for (Instruction i : CODE) {
            new_executor.runInsn(i);
        }

        if (new_executor.RETURNING_VALUE) {
            return executor.ENVIRONMENT.pop();
        }

        return new T2LObject();
    }
}
