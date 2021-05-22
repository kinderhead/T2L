package io.github.kinderhead.T2L.execution;

import io.github.kinderhead.T2L.execution.builtins.T2LAsObject;
import io.github.kinderhead.T2L.execution.builtins.T2LFunction;
import io.github.kinderhead.T2L.execution.builtins.T2LIterable;
import io.github.kinderhead.T2L.execution.builtins.T2LUnlimitedArgs;
import io.github.kinderhead.T2L.execution.errors.AccessDeniedException;
import io.github.kinderhead.T2L.execution.errors.CallableException;
import io.github.kinderhead.T2L.execution.errors.InternalException;
import io.github.kinderhead.T2L.execution.errors.TypeException;
import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class JavaInterface extends T2LObject {
    public Object VALUE;
    public Object PARENT;

    public JavaInterface(Object value, Object parent) {
        VALUE = value;
        if (value != null) {
            NAME = value.getClass().getName();
            if (value instanceof Number) {
                TYPE = T2LTypes.INT;
                NUMBER = ((Number) value).doubleValue();
            } else if (value instanceof String) {
                TYPE = T2LTypes.STRING;
                STRING = (String) value;
            } else if (value instanceof Method) {
                TYPE = T2LTypes.FUNCTION;
                PARENT = parent;

                PARAMS = new ArrayList<>();
                for (int i = 0; i < ((Method) value).getParameterCount(); i++) {
                    PARAMS.add(null);
                }

                if (((Method) value).isAnnotationPresent(T2LFunction.class)) {
                    PARAMS.remove(0);
                }

                if (((Method) value).isAnnotationPresent(T2LUnlimitedArgs.class)) {
                    UNLIMITED_PARAMS = true;
                }
            } else {
                TYPE = T2LTypes.CUSTOM;
            }
        } else {
            TYPE = T2LTypes.NULL;
        }
    }

    private Field getRawField(String name) {
        Field[] fields = VALUE.getClass().getFields();
        for (Field i : fields) {
            if (i.getName().equals(name)) {
                return i;
            }
        }
        return null;
    }

    private Object getField(String name) {
        Field ret = getRawField(name);
        if (ret != null) {
            try {
                return ret.get(VALUE);
            } catch (IllegalAccessException e) {
                return null;
            }
        }
        return null;
    }

    private Method getMethod(String name) {
        Method[] methods = VALUE.getClass().getMethods();
        for (Method i : methods) {
            if (i.getName().equals(name)) {
                return i;
            }
        }
        return null;
    }

    public static Object getSupposedValue(T2LObject obj, Class cls, Executor executor) {
        if (cls.isAssignableFrom(int.class) || cls.isAssignableFrom(Integer.class)) {
            return obj.getInt(executor);
        } else if (cls.isAssignableFrom(double.class) || cls.isAssignableFrom(Double.class)) {
            return obj.getDouble(executor);
        } else if (cls.isAssignableFrom(long.class) || cls.isAssignableFrom(Long.class)) {
            return obj.getLong(executor);
        } else if (cls.isAssignableFrom(short.class) || cls.isAssignableFrom(Short.class)) {
            return obj.getShort(executor);
        } else if (cls.isAssignableFrom(float.class) || cls.isAssignableFrom(Float.class)) {
            return obj.getFloat(executor);
        } else if (cls.isAssignableFrom(byte.class) || cls.isAssignableFrom(Byte.class)) {
            return obj.getByte(executor);
        } else if (cls.isAssignableFrom(String.class)) {
            return obj.getVString(executor);
        } else if (cls.isAssignableFrom(boolean.class)) {
            return obj.isTrue();
        } else if (obj instanceof JavaInterface) {
            return ((JavaInterface) obj).VALUE;
        } else if (cls.isAssignableFrom(T2LObject.class)) {
            return obj;
        } else {
            new TypeException().raise("Cannot create java object from " + obj.NAME + "@" + System.identityHashCode(obj) + " of type " + obj.TYPE, executor.CURRENT_LINE);
            return null;
        }
    }

    private JavaInterface getT2LObject(String name) {
        if (PROPERTIES.containsKey(name)) {
            return (JavaInterface) PROPERTIES.get(name);
        }

        Object obj = null;
        boolean found = false;
        JavaInterface ret;

        Field test_field = getRawField(name);
        if (test_field != null) {
            found = true;
            try {
                obj = test_field.get(VALUE);
            } catch (IllegalAccessException e) {
                return null;
            }
        }

        boolean isMethod = false;

        if (!found) {
            obj = getMethod(name);
            if (obj != null) {
                found = true;
                isMethod = true;
            }
        }

        if (!found) {
            return null;
            //new ValueMissingException().raise("Cannot find property " + name + " of object " + VALUE.getClass().getName() + "@" + System.identityHashCode(VALUE));
        }

        ret = new JavaInterface(obj, VALUE);
        ret.NAME = obj.getClass().getName();

        if (isMethod) {
            PROPERTIES.put(name, ret);
        }

        return ret;
    }

    public Object ifArrayChangeType(Class cls, Object obj, Executor executor) {
        if (!cls.isArray()) {
            return obj;
        }

        ArrayList<Object> out = new ArrayList<>();
        for (Object i : ((Object[]) obj)) {
            if (i instanceof T2LObject) {
                out.add(getSupposedValue(((T2LObject) i), cls.getComponentType(), executor));
            } else {
                out.add(cls.getComponentType().cast(obj));
            }
        }
        return Arrays.copyOf(out.toArray(), out.size(), cls);
    }

    @Override
    public T2LObject rawGet(String name) {
        return getT2LObject(name);
    }

    @Override
    public boolean rawContains(String name) {
        if (VALUE == null) {
            return false;
        }
        return Arrays.stream(VALUE.getClass().getFields()).anyMatch(f -> f.getName().equals(name)) ||
                Arrays.stream(VALUE.getClass().getMethods()).anyMatch(f -> f.getName().equals(name));
    }

    @Override
    public void rawPut(String name, T2LObject obj, Executor executor) {
        Field field = getRawField(name);
        try {
            if (field == null) {
                throw new IllegalAccessException();
            }
            field.set(VALUE, getSupposedValue(obj, field.getType(), executor));
        } catch (IllegalAccessException e) {
            new AccessDeniedException().raise("Cannot access field " + name + " from object " + NAME + "@" + System.identityHashCode(VALUE), executor.CURRENT_LINE);
        }
    }

    @Override
    public T2LObject run(T2LObject obj, List<T2LObject> params, Executor executor) {
        if (VALUE instanceof Method) {
            try {
                Method method = (Method) VALUE;
                Class[] method_params = method.getParameterTypes();
                boolean annotation = method.isAnnotationPresent(T2LFunction.class);
                boolean isAsObject = method.isAnnotationPresent(T2LAsObject.class);
                ArrayList<Object> param = new ArrayList<>();
                ArrayList<T2LObject> extraParams = new ArrayList<>();

                int idex = 0;
                int offset = 0;
                if (annotation) {
                    offset++;
                }

                boolean isExtra = false;
                for (T2LObject i : params) {
                    Class cls;
                    if (ArrayUtils.isArrayIndexValid(method_params, offset)) {
                        cls = method_params[offset];
                    } else {
                        cls = T2LObject[].class;
                    }

                    if (UNLIMITED_PARAMS && offset == method_params.length - 1 && cls.isAssignableFrom(T2LObject[].class)) {
                        isExtra = true;
                    }

                    if (!isExtra) {
                        if (isAsObject && method_params[offset].isAssignableFrom(T2LObject.class)) {
                            param.add(i);
                        } else {
                            param.add(ifArrayChangeType(method_params[offset], getSupposedValue(i, cls, executor), executor));
                        }
                    } else {
                        extraParams.add(i);
                    }
                    idex++;
                    offset++;
                }

                if (UNLIMITED_PARAMS) {
                    param.add(extraParams.toArray(new T2LObject[0]));
                }

                if (annotation) {
                    param.add(0, executor);
                }
                Object out = method.invoke(PARENT, param.toArray());
                if (out instanceof T2LObject) {
                    return (T2LObject) out;
                }
                return new JavaInterface(out, null);
            } catch (IllegalAccessException | IllegalArgumentException e) {
                new CallableException().raise("Error running java object " + VALUE.getClass().getName() + "@" + System.identityHashCode(VALUE), executor.CURRENT_LINE);
            } catch (InvocationTargetException e) {
                Throwable err = e.getCause();
                if (err instanceof T2LError) {
                    ((T2LError) err).run();
                } else {
                    new InternalException(e).raise("Internal exception occured", executor.CURRENT_LINE);
                }
            }
        }
        return super.run(obj, params, executor);
    }

    @Override
    public List<T2LObject> getIterable(Executor executor) {
        if (Arrays.stream(VALUE.getClass().getMethods()).anyMatch(f -> f.getName().equals("iter"))) {
            Method method = getMethod("iter");
            if (method.isAnnotationPresent(T2LIterable.class)) {
                try {
                    return (List<T2LObject>) method.invoke(VALUE, executor);
                } catch (IllegalAccessException | InvocationTargetException ignored) {

                }
            }
        }

        return super.getIterable(executor);
    }

    @Override
    public T2LObject clone() {
        JavaInterface obj = (JavaInterface) super.clone();
        obj.PARENT = PARENT;
        obj.VALUE = VALUE;
        obj.PROPERTIES = new HashMap<>();
        return obj;
    }
}
