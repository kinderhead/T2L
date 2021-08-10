package io.github.kinderhead.T2L.execution.builtins.modules;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.JavaInterface;
import io.github.kinderhead.T2L.execution.T2LModule;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.T2LObjectFactory;
import io.github.kinderhead.T2L.execution.builtins.T2LDictionary;
import io.github.kinderhead.T2L.execution.builtins.T2LFunction;

import java.util.ArrayList;
import java.util.Map;

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
     * Gets the current executor for the scope
     *
     * @param executor Executor
     * @return The executor
     */
    @T2LFunction
    public Executor getExecutor(Executor executor) {
        return executor;
    }

    /**
     *
     *
     * @param executor Executor
     * @param obj The object
     * @return All properties of the object in a dictionary
     */
    @T2LFunction
    public T2LObject getProperties(Executor executor, T2LObject obj) {
        ArrayList<T2LObject> keys = new ArrayList<>();
        ArrayList<T2LObject> values = new ArrayList<>();
        for (Map.Entry<String, T2LObject> entry : obj.PROPERTIES.entrySet()) {
            if (entry.getValue().WAS_IMPORTED) {
                continue;
            }

            keys.add(T2LObjectFactory.createString(entry.getKey()));
            values.add(entry.getValue());
        }

        return new JavaInterface(new T2LDictionary(keys, values, executor), null);
    }
}
