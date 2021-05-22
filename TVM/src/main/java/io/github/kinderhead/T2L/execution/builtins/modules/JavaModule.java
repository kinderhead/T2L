package io.github.kinderhead.T2L.execution.builtins.modules;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.JavaInterface;
import io.github.kinderhead.T2L.execution.T2LError;
import io.github.kinderhead.T2L.execution.T2LModule;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.builtins.T2LAsObject;
import io.github.kinderhead.T2L.execution.builtins.T2LFunction;
import io.github.kinderhead.T2L.execution.builtins.T2LUnlimitedArgs;
import io.github.kinderhead.T2L.execution.errors.CallableException;
import io.github.kinderhead.T2L.execution.errors.TypeException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * The default java module.
 */
public class JavaModule extends T2LModule {
    /**
     * Get the importable name of the module.
     *
     * @return The name
     */
    @Override
    public String getName() {
        return "java";
    }

    /**
     * <code>java.from</code>: Returns a wrapper for a java object.<br>
     * fqn, string: A fully qualified name of a class.<br>
     * args, objects: All other arguments are used as constructor args.<br>
     *
     * Example:
     * <pre>{@code
     * obj = java.from("io.github.kinderhead.T2L.execution.builtins.TestObj", "argument");
     * }</pre>
     * @param executor Executor
     * @param fqn Fully qualified name
     * @param args Arguments
     * @return The wrapped object
     */
    @T2LFunction
    @T2LUnlimitedArgs
    public JavaInterface from(Executor executor, String fqn, T2LObject... args) {
        Class cls = null;
        try {
            cls = Class.forName(fqn);
        } catch (ClassNotFoundException e) {
            new TypeException().raise("Cannot get class " + fqn, executor.CURRENT_LINE);
        }

        for (Constructor i : cls.getConstructors()) {
            ArrayList<Object> params = new ArrayList<>();

            int edex = 0;
            boolean isBreak = false;
            for (Class e : i.getParameterTypes()) {
                Object param_obj;
                try {
                    param_obj = JavaInterface.getSupposedValue(args[edex], e, executor);
                } catch (T2LError | ArrayIndexOutOfBoundsException ex) {
                    isBreak = true;
                    break;
                }
                params.add(param_obj);
                edex++;
            }

            if (isBreak) {
                continue;
            }

            try {
                return new JavaInterface(i.newInstance(params.toArray()), null);
            } catch (InstantiationException | InvocationTargetException | IllegalAccessException e) {
                new CallableException().raise("Error running constructor for object " + fqn);
            }
        }
        return null;
    }

    /**
     * <code>java.asArray</code>: Returns a <code>T2LObject[]</code> from an iterable.<br>
     * obj, iterable: The iterable to convert.<br>
     * Example:
     * <pre>{@code
     * obj = java.asArray([4, 1, 2]);
     * }</pre>
     * @param executor Executor
     * @param obj Object to convert
     * @return Array of objects
     */
    @T2LFunction
    @T2LAsObject
    public Object[] asArray(Executor executor, T2LObject obj) {
        return obj.getIterable(executor).toArray();
    }

    /**
     * <code>java.asJava</code>: Returns a wrapper for the internal <code>T2LObject</code>.<br>
     * obj, object: The object to wrap.<br>
     * See {@link T2LObject} for api information.<br>
     * Example:
     * <pre>{@code
     * obj = java.asJava("Hi");
     * print(obj.clone()); # See API reference
     * }</pre>
     * @param executor Executor
     * @param obj Object to wrap
     * @return Wrapped object
     * @see T2LObject
     */
    @T2LFunction
    @T2LAsObject
    public JavaInterface asJava(Executor executor, T2LObject obj) {
        return new JavaInterface(obj, null);
    }
}
