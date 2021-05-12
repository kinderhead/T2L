package io.github.kinderhead.T2L.execution;

import io.github.kinderhead.T2L.execution.errors.CallableException;
import io.github.kinderhead.T2L.execution.errors.OperationDisabledException;
import io.github.kinderhead.T2L.execution.errors.TypeException;
import io.github.kinderhead.T2L.execution.errors.ValueMissingException;
import io.github.kinderhead.T2L.tvm.Instruction;

import java.text.DecimalFormat;
import java.util.*;

public class T2LObject implements Cloneable{
    public Map<String, T2LObject> PROPERTIES = new HashMap<>();

    public T2LTypes TYPE;
    public int ENV = 0;

    public String STRING = "";
    public double NUMBER = 0;

    public String NAME;

    public ArrayList<Instruction> CODE = new ArrayList<>();
    public ArrayList<String> PARAMS = new ArrayList<>();

    public T2LObject clone() {
        T2LObject clone;
        try {
            clone = (T2LObject) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            clone = new T2LObject();
        }
        clone.PROPERTIES = new HashMap<>();

        for (Map.Entry<String, T2LObject> i : PROPERTIES.entrySet()) {
            clone.PROPERTIES.put(i.getKey(), i.getValue().clone());
        }

        clone.PARAMS = new ArrayList<>();
        clone.PARAMS.addAll(PARAMS);

        clone.STRING = STRING;
        clone.TYPE = TYPE;
        clone.NUMBER = NUMBER;
        clone.ENV = ENV;
        clone.NAME = NAME;

        clone.CODE = new ArrayList<>();
        clone.CODE.addAll(CODE);

        return clone;
    }

    public T2LObject() {
        TYPE = T2LTypes.NULL;
        NAME = "null";
    }

    public T2LObject(T2LTypes type) {
        TYPE = type;
        NAME = type.name().toLowerCase(Locale.ROOT);
    }

    public T2LObject(T2LTypes type, int env) {
        TYPE = type;
        ENV = env;
        NAME = type.name().toLowerCase(Locale.ROOT);
    }

    public T2LObject run(T2LObject obj, List<T2LObject> params, Executor executor) {
        new CallableException().raise("Object " + NAME + "@" + System.identityHashCode(this) + " does not support operation call");
        return new T2LObject();
    }

    public boolean equals(T2LObject obj, Executor executor) {
        if (TYPE == T2LTypes.STRING && isTypeEqual(obj)) {
            return STRING.equals(obj.STRING);
        } else if (TYPE == T2LTypes.INT && isTypeEqual(obj)) {
            return NUMBER == obj.NUMBER;
        } else if (TYPE == T2LTypes.CUSTOM && rawContains("__equals")) {
            return (get("__equals").run(this, new ArrayList<>(Collections.singletonList(obj)), executor).NUMBER == 1);
        } else {
            return this == obj;
        }
    }

    public boolean greaterThan(T2LObject obj, Executor executor) {
        if (TYPE == T2LTypes.STRING && isTypeEqual(obj)) {
            new OperationDisabledException().raise("Cannot use this operation on strings", executor.CURRENT_LINE);
            return false;
        } else if (TYPE == T2LTypes.INT && isTypeEqual(obj)) {
            return NUMBER > obj.NUMBER;
        } else if (TYPE == T2LTypes.CUSTOM && rawContains("__greaterThan")) {
            return (get("__greaterThan").run(this, new ArrayList<>(Collections.singletonList(obj)), executor).NUMBER == 1);
        } else {
            new OperationDisabledException().raise("Cannot use this operation on object " + NAME, executor.CURRENT_LINE);
            return false;
        }
    }

    public boolean lessThan(T2LObject obj, Executor executor) {
        if (TYPE == T2LTypes.STRING && isTypeEqual(obj)) {
            new OperationDisabledException().raise("Cannot use this operation on strings", executor.CURRENT_LINE);
            return false;
        } else if (TYPE == T2LTypes.INT && isTypeEqual(obj)) {
            return NUMBER < obj.NUMBER;
        } else if (TYPE == T2LTypes.CUSTOM && rawContains("__lessThan")) {
            return (get("__lessThan").run(this, new ArrayList<>(Collections.singletonList(obj)), executor).NUMBER == 1);
        } else {
            new OperationDisabledException().raise("Cannot use this operation on object " + NAME, executor.CURRENT_LINE);
            return false;
        }
    }

    public double add(T2LObject obj, Executor executor) {
        if (TYPE == T2LTypes.STRING && isTypeEqual(obj)) {
            new OperationDisabledException().raise("Cannot use this operation on strings", executor.CURRENT_LINE);
            return -1;
        } else if (TYPE == T2LTypes.INT && isTypeEqual(obj)) {
            return NUMBER + obj.NUMBER;
        } else if (TYPE == T2LTypes.CUSTOM && rawContains("__add")) {
            return get("__add").run(this, new ArrayList<>(Collections.singletonList(obj)), executor).NUMBER;
        } else {
            new OperationDisabledException().raise("Cannot use this operation on object " + NAME, executor.CURRENT_LINE);
            return -1;
        }
    }

    public double sub(T2LObject obj, Executor executor) {
        if (TYPE == T2LTypes.STRING && isTypeEqual(obj)) {
            new OperationDisabledException().raise("Cannot use this operation on strings", executor.CURRENT_LINE);
            return -1;
        } else if (TYPE == T2LTypes.INT && isTypeEqual(obj)) {
            return NUMBER - obj.NUMBER;
        } else if (TYPE == T2LTypes.CUSTOM && rawContains("__sub")) {
            return get("__sub").run(this, new ArrayList<>(Collections.singletonList(obj)), executor).NUMBER;
        } else {
            new OperationDisabledException().raise("Cannot use this operation on object " + NAME, executor.CURRENT_LINE);
            return -1;
        }
    }

    public double mul(T2LObject obj, Executor executor) {
        if (TYPE == T2LTypes.STRING && isTypeEqual(obj)) {
            new OperationDisabledException().raise("Cannot use this operation on strings", executor.CURRENT_LINE);
            return -1;
        } else if (TYPE == T2LTypes.INT && isTypeEqual(obj)) {
            return NUMBER * obj.NUMBER;
        } else if (TYPE == T2LTypes.CUSTOM && rawContains("__mul")) {
            return get("__mul").run(this, new ArrayList<>(Collections.singletonList(obj)), executor).NUMBER;
        } else {
            new OperationDisabledException().raise("Cannot use this operation on object " + NAME, executor.CURRENT_LINE);
            return -1;
        }
    }

    public double div(T2LObject obj, Executor executor) {
        if (TYPE == T2LTypes.STRING && isTypeEqual(obj)) {
            new OperationDisabledException().raise("Cannot use this operation on strings", executor.CURRENT_LINE);
            return -1;
        } else if (TYPE == T2LTypes.INT && isTypeEqual(obj)) {
            return NUMBER / obj.NUMBER;
        } else if (TYPE == T2LTypes.CUSTOM && rawContains("__div")) {
            return get("__div").run(this, new ArrayList<>(Collections.singletonList(obj)), executor).NUMBER;
        } else {
            new OperationDisabledException().raise("Cannot use this operation on object " + NAME, executor.CURRENT_LINE);
            return -1;
        }
    }

    public double mod(T2LObject obj, Executor executor) {
        if (TYPE == T2LTypes.STRING && isTypeEqual(obj)) {
            new OperationDisabledException().raise("Cannot use this operation on strings", executor.CURRENT_LINE);
            return -1;
        } else if (TYPE == T2LTypes.INT && isTypeEqual(obj)) {
            return NUMBER % obj.NUMBER;
        } else if (TYPE == T2LTypes.CUSTOM && rawContains("__mod")) {
            return get("__mod").run(this, new ArrayList<>(Collections.singletonList(obj)), executor).NUMBER;
        } else {
            new OperationDisabledException().raise("Cannot use this operation on object " + NAME, executor.CURRENT_LINE);
            return -1;
        }
    }

    public double pow(T2LObject obj, Executor executor) {
        if (TYPE == T2LTypes.STRING && isTypeEqual(obj)) {
            new OperationDisabledException().raise("Cannot use this operation on strings", executor.CURRENT_LINE);
            return -1;
        } else if (TYPE == T2LTypes.INT && isTypeEqual(obj)) {
            return Math.pow(NUMBER, obj.NUMBER);
        } else if (TYPE == T2LTypes.CUSTOM && rawContains("__pow")) {
            return get("__pow").run(this, new ArrayList<>(Collections.singletonList(obj)), executor).NUMBER;
        } else {
            new OperationDisabledException().raise("Cannot use this operation on object " + NAME, executor.CURRENT_LINE);
            return -1;
        }
    }

    public boolean isTrue() {
        if (TYPE == T2LTypes.NULL) {
            return false;
        } else if (TYPE == T2LTypes.STRING && STRING.equals("")) {
            return false;
        } else if (TYPE == T2LTypes.INT && NUMBER == 0) {
            return false;
        }

        return true;
    }

    public String getString(Executor executor) {
        if (TYPE == T2LTypes.STRING) {
            return STRING;
        } else if (TYPE == T2LTypes.INT) {
            if (NUMBER == Math.round(NUMBER) && NUMBER < 2147483647) {
                return String.valueOf((int)NUMBER);
            }
            return new DecimalFormat("#").format(NUMBER);
        } else if (rawContains("__string")) {
            return get("__string", executor).run(this, new ArrayList<>(), executor).getString(executor);
        }

        return "[Object " + NAME + "@" + System.identityHashCode(this) + "]";
    }

    public boolean isTypeEqual(T2LObject obj) {
        return obj.TYPE == this.TYPE;
    }

    public T2LObject get(String name, Executor executor) {
        T2LObject obj = get(name);
        if (obj != null) {
            return obj;
        }
        new ValueMissingException().raise("Cannot get property " + name + " from object", executor.CURRENT_LINE);
        return null;
    }

    /**
     * WARNING: Only use this if you know the property exists, or if you check if return value is null
     * Does not require an executor
     */
    public T2LObject get(String name) {
        return getObjFromProperties(name, false);
    }

    public void set(String name, T2LObject obj, Executor executor) {
        getObjFromProperties(name, true).rawPut(name, obj, executor);
    }

    public T2LObject getObjFromProperties(String name, boolean setting) {
        if (!name.contains(".")) {
            if (setting) {
                return this;
            }
            return rawGet(name);
        }

        if (name.length() == 0) {
            return this;
        }

        String rest = "";

        if (name.contains(".")) {
            rest = name.split("\\.", 3)[1];
            name = name.split("\\.", 3)[0];
        }

        return rawGet(name).getObjFromProperties(rest, false);
    }

    public T2LObject rawGet(String name) {
        return PROPERTIES.get(name);
    }

    public void rawPut(String name, T2LObject obj, Executor executor) {
        PROPERTIES.put(name, obj);
    }

    public boolean rawContains(String name) {
        return PROPERTIES.containsKey(name);
    }

    public Object getJavaObject(T2LObject obj) {
        if (obj.TYPE == T2LTypes.STRING) {
            return obj.STRING;
        } else if (obj.TYPE == T2LTypes.INT) {
            return obj.NUMBER;
        }
        return null;
    }

    public int getInt(Executor executor) {
        if (TYPE != T2LTypes.INT) {
            new TypeException().raise("Cannot get number from object " + NAME);
        }
        return ((Number) NUMBER).intValue();
    }

    public double getDouble(Executor executor) {
        if (TYPE != T2LTypes.INT) {
            new TypeException().raise("Cannot get number from object " + NAME, executor.CURRENT_LINE);
        }
        return NUMBER;
    }

    public short getShort(Executor executor) {
        if (TYPE != T2LTypes.INT) {
            new TypeException().raise("Cannot get number from object " + NAME, executor.CURRENT_LINE);
        }
        return ((Number) NUMBER).shortValue();
    }

    public long getLong(Executor executor) {
        if (TYPE != T2LTypes.INT) {
            new TypeException().raise("Cannot get number from object " + NAME, executor.CURRENT_LINE);
        }
        return ((Number) NUMBER).longValue();
    }

    public byte getByte(Executor executor) {
        if (TYPE != T2LTypes.INT) {
            new TypeException().raise("Cannot get number from object " + NAME, executor.CURRENT_LINE);
        }
        return ((Number) NUMBER).byteValue();
    }

    public float getFloat(Executor executor) {
        if (TYPE != T2LTypes.INT) {
            new TypeException().raise("Cannot get number from object " + NAME, executor.CURRENT_LINE);
        }
        return ((Number) NUMBER).floatValue();
    }

    public String getVString(Executor executor) {
        if (TYPE != T2LTypes.STRING) {
            new TypeException().raise("Cannot get string from object " + NAME, executor.CURRENT_LINE);
        }
        return STRING;
    }

    public List<T2LObject> getIterable(Executor executor) {
        if (TYPE == T2LTypes.STRING) {
            String[] strs = STRING.split("");
            ArrayList<T2LObject> objs = new ArrayList<>();
            for (String i: strs) {
                T2LObject obj = new T2LObject(T2LTypes.STRING);
                obj.STRING = i;
                objs.add(obj);
            }
            return objs;
        } else if (TYPE == T2LTypes.INT){
            ArrayList<T2LObject> obj = new ArrayList<>();
            for (int i = 0; i < NUMBER; i++) {
                T2LObject ret = new T2LObject(T2LTypes.INT);
                ret.NUMBER = i;
                obj.add(ret);
            }
            return obj;
        } else {
            new OperationDisabledException().raise("Cannot iterate object " + NAME + "@" + System.identityHashCode(this), executor.CURRENT_LINE);
            return null;
        }
    }
}
