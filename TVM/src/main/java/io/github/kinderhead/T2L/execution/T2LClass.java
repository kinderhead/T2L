package io.github.kinderhead.T2L.execution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class T2LClass extends T2LObject {
    public T2LClass() {
        TYPE = T2LTypes.CLASS;
    }

    public T2LClass(LocalEnvironment env) {
        build(env.OBJECTS);
        env.OBJECTS.clear();
        TYPE = T2LTypes.CLASS;
    }

    public void build(Map<String, T2LObject> env) {
        for (Map.Entry<String, T2LObject> i: env.entrySet()){
            PROPERTIES.put(i.getKey(), i.getValue());
        }
    }

    public void inherit(T2LObject parent) {
        parent.PROPERTIES.forEach((k, v) -> {
            PROPERTIES.put(k, v.clone());
        });
    }

    public T2LClassObj instantiate(ArrayList<T2LObject> params, String loc_name, int loc_env) {
        T2LClassObj obj = new T2LClassObj();
        obj.ORIGIN_NAME = loc_name;
        obj.ORIGIN_ENV = loc_env;

        obj.PROPERTIES = new HashMap<>();
        for (Map.Entry<String, T2LObject> i : PROPERTIES.entrySet()) {
            obj.PROPERTIES.put(i.getKey(), i.getValue().clone());
        }
        obj.NAME = NAME;

        return obj;
    }
}
