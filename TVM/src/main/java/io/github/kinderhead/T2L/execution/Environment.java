package io.github.kinderhead.T2L.execution;

import io.github.kinderhead.T2L.execution.builtins.Bool;
import io.github.kinderhead.T2L.execution.builtins.Import;
import io.github.kinderhead.T2L.execution.builtins.Print;
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

public class Environment {
    public Map<Integer, LocalEnvironment> ENVIRONMENTS = new HashMap<>();
    private int env_num = 0;
    private Stack<T2LObject> STACK = new Stack<>();
    public ArrayList<String> SEARCH_PATHS = new ArrayList<>();

    public Environment() {
        try {
            SEARCH_PATHS.add(new File(getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getPath());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        ENVIRONMENTS.put(0, new LocalEnvironment());
    }

    public void populateBase(Executor executor) {
        set(0, "print", new Print(0), executor);
        set(0, "true", new Bool(true), executor);
        set(0, "false", new Bool(false), executor);
        set(0, "__import", new Import(0), executor);
        //set(0, "list", new JavaInterface(new T2LList(), null));
    }

    public void push(T2LObject obj) {
        STACK.add(obj);
    }

    public T2LObject pop() {
        return STACK.pop();
    }

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

    public T2LObject get(int env, String name) {
        Map.Entry<Integer, T2LObject> kv = getWithEnvironment(env, name);
        if (kv == null || kv.getValue() == null) {
            return null;
        }
        return kv.getValue();
    }

    public int variableInEnv(int env, String name) {
        Map.Entry<Integer, T2LObject> kv = getWithEnvironment(env, name);
        if (kv == null) {
            return -1;
        }
        return kv.getKey();
    }

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

    public int newEnvironment(int prev) {
        env_num++;
        ENVIRONMENTS.put(env_num, new LocalEnvironment());
        ENVIRONMENTS.get(env_num).PREVIOUS_ENVIRONMENT = prev;
        return env_num;
    }

    public void importFile(String name, Executor executor) {
        importFile(name, executor, true);
    }

    public boolean importFile(String name, Executor executor, boolean err) {
        name = name.replace(".", "/");
        File file = new File(name + ".t2lm");

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
        new_executor.CURRENT_ENVIRONMENT = executor.CURRENT_ENVIRONMENT;
        new_executor.CODE = new Reader(new ArrayList<>(Arrays.asList(ArrayUtils.toObject(data)))).read();
        new_executor.execute();
        // ee
        return true;
    }
}
