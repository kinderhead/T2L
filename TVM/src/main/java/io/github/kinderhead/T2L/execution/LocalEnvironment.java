package io.github.kinderhead.T2L.execution;

import java.util.HashMap;
import java.util.Map;

public class LocalEnvironment {
    public Map<String, T2LObject> OBJECTS = new HashMap<>();
    public int PREVIOUS_ENVIRONMENT;

    public LocalEnvironment() {
        PREVIOUS_ENVIRONMENT = 0;
    }

    public T2LObject get(String name) {
        return OBJECTS.get(name);
    }

    public void set(String name, T2LObject obj) {
        OBJECTS.put(name, obj);
    }
}
