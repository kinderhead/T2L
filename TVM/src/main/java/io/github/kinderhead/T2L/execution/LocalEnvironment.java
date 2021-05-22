package io.github.kinderhead.T2L.execution;

import java.util.HashMap;
import java.util.Map;

/**
 * The environment for a single scope.
 * It contains the actual variables.
 *
 * @see Environment
 */
public class LocalEnvironment {
    public Map<String, T2LObject> OBJECTS = new HashMap<>();
    public int PREVIOUS_ENVIRONMENT;

    /**
     * Creates the environment.
     */
    public LocalEnvironment() {
        PREVIOUS_ENVIRONMENT = 0;
    }

    /**
     * Gets a variable from the environment
     *
     * @param name The name
     * @return The object or null;
     */
    public T2LObject get(String name) {
        return OBJECTS.get(name);
    }

    /**
     * Sets the variable
     *
     * @param name The name
     * @param obj The object
     */
    public void set(String name, T2LObject obj) {
        OBJECTS.put(name, obj);
    }
}
