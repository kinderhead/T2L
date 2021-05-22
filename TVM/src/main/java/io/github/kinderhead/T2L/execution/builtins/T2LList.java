package io.github.kinderhead.T2L.execution.builtins;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.errors.IndexOutOfBoundsException;
import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

public class T2LList {
    private ArrayList<T2LObject> DATA;

    public T2LList(ArrayList<T2LObject> objs) {
        DATA = objs;
    }

    @T2LFunction
    public String __string(Executor executor) {
        StringBuilder out = new StringBuilder("[ ");
        int idex = 0;
        for (T2LObject obj : DATA) {
            if (idex == DATA.size() - 1) {
                out.append(obj.getString(executor));
                idex++;
                continue;
            }
            out.append(obj.getString(executor)).append(", ");
            idex++;
        }
        out.append(" ]");
        return out.toString();
    }

    @T2LFunction
    public T2LObject __get(Executor executor, int id) {
        return DATA.get(id);
    }

    @T2LFunction
    public void __set(Executor executor, int id, T2LObject obj) {
        if (!ArrayUtils.isArrayIndexValid(DATA.toArray(), id)) {
            new IndexOutOfBoundsException().raise(String.valueOf(id), executor.CURRENT_LINE);
        }
        DATA.remove(id);
        DATA.add(id, obj);
    }

    @T2LFunction
    public void add(Executor executor, T2LObject obj) {
        DATA.add(obj);
    }

    @T2LIterable
    public List<T2LObject> iter(Executor executor) {
        return DATA;
    }
}
