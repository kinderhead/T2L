package io.github.kinderhead.T2L.execution.builtins.modules;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.T2LModule;
import io.github.kinderhead.T2L.execution.builtins.T2LFunction;

/**
 * The default system module.
 */
public class SystemModule extends T2LModule {
    /**
     * Get the importable name of the module.
     *
     * @return The name
     */
    @Override
    public String getName() {
        return "system";
    }

    /**
     * <code>system.getExecutor</code>: Gets the current executor for the scope.<br>
     * Example:
     * <pre>{@code
     * print(system.getExecutor());
     * }</pre>
     * @param executor Executor
     * @return The executor
     */
    @T2LFunction
    public Executor getExecutor(Executor executor) {
        return executor;
    }
}
