package io.github.kinderhead.T2L.execution;

import io.github.kinderhead.T2L.execution.builtins.Bool;
import io.github.kinderhead.T2L.execution.builtins.Import;
import io.github.kinderhead.T2L.execution.builtins.JImport;
import io.github.kinderhead.T2L.execution.builtins.Print;
import io.github.kinderhead.T2L.execution.builtins.modules.JavaModule;
import io.github.kinderhead.T2L.execution.builtins.modules.SystemModule;
import io.github.kinderhead.T2L.execution.errors.TypeException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.ArrayUtils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Global environment for current thread.
 * Set the {@link Environment#ENVIRONMENTS} of a new thread's
 * environment to this one's {@link Environment#ENVIRONMENTS}.
 */
public class Environment {
    public Map<Integer, LocalEnvironment> ENVIRONMENTS = new HashMap<>();
    private int env_num = 0;
    private Stack<T2LObject> STACK = new Stack<>();
    private ArrayList<T2LModule> JAVA_MODULES = new ArrayList<>();
    public ArrayList<String> SEARCH_PATHS = new ArrayList<>();
    public Map<String, T2LObject> MODULES = new HashMap<>();
    //public ArrayList<String> JARS = new ArrayList<>();

    /**
     * Creates an environment.
     */
    public Environment() {
        try {
            SEARCH_PATHS.add(new File(getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getPath());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        ENVIRONMENTS.put(0, new LocalEnvironment());
        registerModule(new JavaModule());
        registerModule(new SystemModule());
    }

    /**
     * Registers a {@link T2LModule}.
     *
     * @param module The module
     * @see T2LModule
     */
    public void registerModule(T2LModule module) {
        JAVA_MODULES.add(module);
    }

    /**
     * Populates the base environment with builtins.
     * Should only run once per session.
     *
     * @param executor Executor
     */
    public void populateBase(Executor executor) {
        set(0, "print", new Print(0), executor);
        set(0, "true", new Bool(true), executor);
        set(0, "false", new Bool(false), executor);
        set(0, "null", new T2LObject(), executor);
        set(0, "__import", new Import(0), executor);
        set(0, "__jimport", new JImport(0), executor);
        //set(0, "list", new JavaInterface(new T2LList(), null));
    }

    /**
     * Push an object to the stack.
     *
     * @param obj The object to push
     * @see T2LObject
     */
    public void push(T2LObject obj) {
        STACK.add(obj);
    }

    /**
     * Pops the most recent object on the stack.
     *
     * @return The popped object
     */
    public T2LObject pop() {
        return STACK.pop();
    }

    /**
     * Gets a variable with the environment.
     *
     * @param env Source env
     * @param name The name
     * @return A {@link Map.Entry} of the env and object or null
     */
    private Map.Entry<Integer, T2LObject> getWithEnvironment(int env, String name) {
        String rest = "";

        if (name.contains(".")) {
            rest = name.split("\\.", 2)[1];
            name = name.split("\\.", 2)[0];
        }

        LocalEnvironment environment = ENVIRONMENTS.get(env);
        T2LObject current = environment.get(name);
        if (current == null) {
            if (env == 0) {
                return null;
            }
            Map.Entry<Integer, T2LObject> out = getWithEnvironment(environment.PREVIOUS_ENVIRONMENT, name);
            if (out == null) {
                return null;
            }
            if (!rest.equals("")) {
                return new AbstractMap.SimpleEntry<>(environment.PREVIOUS_ENVIRONMENT, finishWithRest(out.getValue(), rest));
            }
            return new AbstractMap.SimpleEntry<>(environment.PREVIOUS_ENVIRONMENT, out.getValue());
        }
        if (!rest.equals("")) {
            return new AbstractMap.SimpleEntry<>(env, finishWithRest(current, rest));
        }
        return new AbstractMap.SimpleEntry<>(env, current);
    }

    private T2LObject finishWithRest(T2LObject obj, String rest) {
        return obj.get(rest);
    }

    /**
     * Get a variable from the environment.
     *
     * @param env The source env
     * @param name The name
     * @return The object or null
     */
    public T2LObject get(int env, String name) {
        Map.Entry<Integer, T2LObject> kv = getWithEnvironment(env, name);
        if (kv == null || kv.getValue() == null) {
            return null;
        }
        return kv.getValue();
    }

    /**
     * Gets the environment number of an object.
     *
     * @param env The source env
     * @param name The name
     * @return The environment or -1
     */
    public int variableInEnv(int env, String name) {
        Map.Entry<Integer, T2LObject> kv = getWithEnvironment(env, name);
        if (kv == null) {
            return -1;
        }
        return kv.getKey();
    }

    /**
     * Set a variable in the environment.
     *
     * @param env The source env
     * @param name The name
     * @param obj The object
     * @param executor Executor
     */
    public void set(int env, String name, T2LObject obj, Executor executor) {
        int num = variableInEnv(env, name);
        int this_env;

        LocalEnvironment environment;
        if (num == -1) {
            environment = ENVIRONMENTS.get(env);
            this_env = env;
        } else {
            environment = ENVIRONMENTS.get(num);
            this_env = num;
        }

        if (!name.contains(".")) {
            environment.set(name, obj);
        } else {
            String[] regex = name.split("\\.");
            ArrayList<String> new_name = new ArrayList<>();
            String last = "";
            int num2 = 0;
            for (String i : regex) {
                if (num2 == regex.length - 1) {
                    last = i;
                    num2++;
                    continue;
                }
                new_name.add(i);
                num2++;
            }

            get(this_env, String.join(".", new_name)).set(last, obj, executor);
        }
    }

    /**
     * Creates and registers a new environment.
     *
     * @param prev The source environment
     * @return The new environment
     */
    public int newEnvironment(int prev) {
        env_num++;
        ENVIRONMENTS.put(env_num, new LocalEnvironment());
        ENVIRONMENTS.get(env_num).PREVIOUS_ENVIRONMENT = prev;
        return env_num;
    }

    /**
     * Imports a java class to the environment.
     *
     * @param name The name
     * @param executor Executor
     * @return If it succeded
     */
    public boolean jImport(String name, Executor executor) {
        Class cls = null;
        try {
            cls = Class.forName(name);
        } catch (ClassNotFoundException e) {
            new TypeException().raise("Cannot get class " + name, executor.CURRENT_LINE);
        }

        JavaClassInterface mod = new JavaClassInterface(cls, null, executor);

        String mod_name = name.split("\\.")[name.split("\\.").length - 1];

        set(executor.CURRENT_ENVIRONMENT, mod_name, mod, executor);

        return false;
    }

    /**
     * Imports a file or builtin.
     *
     * @param name The name
     * @param executor executor
     */
    public void importFile(String name, Executor executor) {
        importFile(name, executor, true);
    }

    /**
     * Imports a file or builtin.
     *
     * @param name The name
     * @param executor Executor
     * @param err Is it the first recursion?
     * @return If is succeded
     */
    public boolean importFile(String name, Executor executor, boolean err) {
        name = name.replace(".", "/");
        File file = new File(name + ".t2lm");
        String mod_name = new File(name).getName();

        if (err) {
            for (Map.Entry<String, T2LObject> entry : MODULES.entrySet()) {
                if (entry.getKey().equals(mod_name)) {
                    set(executor.CURRENT_ENVIRONMENT, mod_name, entry.getValue(), executor);
                    return true;
                }
            }

            for (T2LModule mod : JAVA_MODULES) {
                if (mod.getName().equals(mod_name)) {
                    set(executor.CURRENT_ENVIRONMENT, mod_name, new JavaInterface(mod, null), executor);
                    return true;
                }
            }
        }

        byte[] data;
        if (file.exists()) {
            try {
                data = FileUtils.readFileToByteArray(file);
            } catch (IOException e) {
                new io.github.kinderhead.T2L.execution.errors.IOException().raise("Could not import " + name, executor.CURRENT_LINE);
                return false;
            }
        } else {
            if (err) {
                if (importFile("lib." + name, executor, false)) {
                    return true;
                }

                for (String i : SEARCH_PATHS) {
                    Path path = Paths.get(i, name);
                    if (importFile(path.toString(), executor, false)) {
                        return true;
                    }
                }
            } else {
                return false;
            }
            new io.github.kinderhead.T2L.execution.errors.IOException().raise("Cannot find module with name " + name, executor.CURRENT_LINE);
            return false;
        }

        Executor new_executor = new Executor(executor.ENVIRONMENT);
        new_executor.CURRENT_ENVIRONMENT = newEnvironment(executor.CURRENT_ENVIRONMENT);
        new_executor.CODE = new Reader(new ArrayList<>(Arrays.asList(ArrayUtils.toObject(data)))).read();
        new_executor.execute();

        T2LClass module = new T2LClass();
        module.build(ENVIRONMENTS.get(new_executor.CURRENT_ENVIRONMENT).OBJECTS);
        T2LClassObj obj = module.instantiate(new ArrayList<>(), mod_name, -1, executor);
        set(executor.CURRENT_ENVIRONMENT, mod_name, obj, executor);
        MODULES.put(mod_name, obj);
        // ee
        return true;
    }
}
