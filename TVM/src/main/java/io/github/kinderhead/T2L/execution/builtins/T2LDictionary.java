package io.github.kinderhead.T2L.execution.builtins;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.errors.ParameterException;
import io.github.kinderhead.T2L.execution.errors.ValueMissingException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class T2LDictionary {
    private HashMap<T2LObject, T2LObject> data = new HashMap<>();

    public T2LDictionary(ArrayList<T2LObject> keys, ArrayList<T2LObject> values, Executor executor) {
        if (keys.size() != values.size()) {
            new ParameterException().raise("Cannot create dictionary with mismatched keys and values", executor.CURRENT_LINE);
        }

        int idex = 0;
        for (T2LObject key : keys) {
            key.equals(new T2LObject(), executor);
            data.put(key, values.get(idex));
            idex++;
        }
    }

    @T2LFunction
    public T2LObject __get(Executor executor, T2LObject name) {
        T2LObject out = null;
        for (T2LObject key : data.keySet()) {
            if (key.equals(name, executor)) {
                out = data.get(key);
            }
        }

        if (out == null) {
            new ValueMissingException().raise("Cannot find value for key " + name.getString(executor), executor.CURRENT_LINE);
        }

        return out;
    }

    @T2LFunction
    public void __set(Executor executor, T2LObject name, T2LObject obj) {
        data.put(name, obj);
    }

    @T2LFunction
    public String __string(Executor executor) {
        StringBuilder builder = new StringBuilder("{ ");
        for (Map.Entry<T2LObject, T2LObject> i: data.entrySet()) {
            builder.append(i.getKey().getString(executor));
            builder.append(": ");
            builder.append(i.getValue().getString(executor));
            builder.append(", ");
        }
        builder.deleteCharAt(builder.lastIndexOf(","));
        builder.deleteCharAt(builder.lastIndexOf(" "));
        builder.append(" }");
        return builder.toString();
    }
}
