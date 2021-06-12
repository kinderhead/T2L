package io.github.kinderhead.T2L.execution;

import io.github.kinderhead.T2L.execution.builtins.modules.JavaModule;
import io.github.kinderhead.T2L.execution.errors.TypeException;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class JavaClassInterface extends JavaInterface {
    /**
     * Creates a wrapper of object with parent. The parent should be null unless <code>value</code> is of type {@link
     * Method}
     *
     * @param value Object to wrap
     * @param parent Parent object
     */
    public JavaClassInterface(Object value, Object parent, Executor executor) {
        super(value, parent);
        if (!(value instanceof Class)) {
            new TypeException().raise("Cannot create static class of type " + ((Class) value).getName(), executor.CURRENT_LINE);
        }
    }

    /**
     * The raw method to get an object. Overload this method for custom property functionality.
     * overloading the property getter.
     *
     * @param name The name
     * @return The object
     */
    @Override
    public T2LObject rawGet(String name) {
        if (PROPERTIES.containsKey(name)) {
            return (JavaInterface) PROPERTIES.get(name);
        }

        Object obj = null;
        boolean found = false;
        JavaInterface ret;

        Field test_field = getRawField(name);
        if (test_field != null && Modifier.isStatic(test_field.getModifiers())) {
            found = true;
            try {
                obj = test_field.get(null);
            } catch (IllegalAccessException e) {
                return null;
            }
        }

        boolean isMethod = false;

        if (!found) {
            obj = getMethod(name);
            if (obj != null && Modifier.isStatic(((Method) obj).getModifiers())) {
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

    /**
     * Gets a method from the object.
     *
     * @param name The name
     * @return The method or null
     */
    @Override
    Method getMethod(String name) {
        Method[] methods = classGetter().getMethods();
        for (Method i : methods) {
            if (i.getName().equals(name)) {
                return i;
            }
        }
        return null;
    }

    /**
     * Gets a {@link Field} from the object.
     *
     * @param name The name
     * @return The field or null
     */
    @Override
    Field getRawField(String name) {
        Field[] fields = classGetter().getFields();
        for (Field i : fields) {
            if (i.getName().equals(name)) {
                return i;
            }
        }
        return null;
    }

    public T2LObject instantiate(ArrayList<T2LObject> params, String loc_name, int loc_env, Executor executor) {
        return new JavaModule()._fromClass(executor, classGetter(), classGetter().getName(), params.toArray(new T2LObject[0]));
    }

    private Class classGetter() {
        return ((Class) VALUE);
    }
}
