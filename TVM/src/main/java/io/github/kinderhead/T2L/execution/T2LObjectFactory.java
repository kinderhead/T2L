package io.github.kinderhead.T2L.execution;

import io.github.kinderhead.T2L.execution.builtins.T2LList;

import java.util.ArrayList;

/**
 * Utils for creating {@link T2LObject}s
 */
public class T2LObjectFactory {
    /**
     * Creates a {@link T2LObject} for a string.
     *
     * @param txt The string
     * @return The object created
     */
    public static T2LObject createString(String txt) {
        T2LObject obj = new T2LObject(T2LTypes.STRING);
        obj.STRING = txt;
        return obj;
    }

    /**
     * Creates a {@link T2LObject} for a double.
     *
     * @param num The number
     * @return The object created
     */
    public static T2LObject createDouble(double num) {
        T2LObject obj = new T2LObject(T2LTypes.INT);
        obj.NUMBER = num;
        return obj;
    }

    public static T2LObject arrayToList(ArrayList array, Class cls) {
        ArrayList<T2LObject> objs = new ArrayList<>();
        for (Object i : array) {
            objs.add(new JavaInterface(i, null));
        }
        return new JavaInterface(new T2LList(objs), null);
    }
}
