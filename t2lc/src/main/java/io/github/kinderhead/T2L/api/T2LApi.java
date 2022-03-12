package io.github.kinderhead.T2L.api;

import io.github.kinderhead.T2L.console.Log;
import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.JavaInterface;
import io.github.kinderhead.T2L.execution.Reader;
import io.github.kinderhead.T2L.execution.T2LError;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.T2LTypes;
import io.github.kinderhead.T2L.tvm.Instruction;
import io.github.kinderhead.T2L.tvm.Main;

import java.io.File;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.Permission;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Public API for T2L
 */
public class T2LApi {
    private Executor exec;

    /**
     * If you are using a security manager, do not use the T2L security manager.
     * The only thing it does is fix exception tracebacks.
     *
     * @param useSecurityManager Use security manager
     */
    public T2LApi(boolean useSecurityManager) { // TODO: Find alternative to this
        if (useSecurityManager) {
            setSecurityManager();
        }
    }

    public T2LApi() {
        setSecurityManager();
    }

    /**
     * Execute the loaded code.
     *
     * @throws Throwable Will throw an exception if an error occurs, most likely a {@link T2LError}
     */
    public void execute() throws Throwable {
        try {
            exec.execute();
        } catch (T2LError e) {
            Log.Error(e.getMessage());
            Main.STACK = e.getStackTrace();
            if (e.SOURCE != null) {
                Main.STACK = e.SOURCE.getStackTrace();
                throw e.SOURCE;
            }
            System.exit(1);
        } catch (Throwable e) { // Catch everything except NPE for some reason
            Log.Error("An internal error has occured on line " + exec.CURRENT_LINE);
            throw e;
        }
    }

    /**
     * Load and compile code.
     *
     * @param code The code
     */
    public void loadCode(String code) {
        ArrayList<Byte> bytes = io.github.kinderhead.T2L.t2lc.Main.compile(code);
        exec = new Executor(new Reader(bytes));
    }

    /**
     * Load a list of jars.
     *
     * @param jars Jars to load
     */
    public void linkJars(ArrayList<String> jars) {
        ArrayList<URL> jurls = new ArrayList<>();

        for (String i : jars) {
            try {
                jurls.add(new File(i).toURI().toURL());
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }

        URLClassLoader child = new URLClassLoader(
                jurls.toArray(new URL[0]),
                jurls.getClass().getClassLoader()
        );
    }

    /**
     * Run a function and convert Java objects to T2L using {@link JavaInterface}.
     *
     * @param name Name
     * @param params Parameters
     * @return The return value
     */
    public T2LObject run(String name, Object... params) {
        T2LObject obj = get(name);

        ArrayList<T2LObject> t2lparams = new ArrayList<>();

        for (Object i: params) {
            t2lparams.add(new JavaInterface(i, null));
        }

        return obj.run(null, t2lparams, exec);
    }

    public T2LObject get(String name) {
        return Instruction.environmentGetErrorHandler(0, name, exec);
    }

    private void setSecurityManager() {
        System.setSecurityManager(new SecurityManager() {

            @Override
            public void checkPermission(Permission perm) {
            }

            @Override
            public void checkExit(int status) {
                if (status != 0) {
                    SecurityException err = new SecurityException();
                    if (Main.STACK != null) {
                        err.setStackTrace(Main.STACK);
                    }
                    throw err;
                }
            }

        });
    }
}
