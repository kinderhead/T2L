package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.console.Log;
import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Reader;
import io.github.kinderhead.T2L.execution.T2LError;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /**
     * Getting the stack trace of an error.
     */
    public static StackTraceElement[] STACK;

    public static void main(String[] args) throws Throwable {
        Options options = new Options();
        options.addOption("i", "input", true, "Input file");
        options.addOption("p", "path", true, "Default search path for imports");

        Option jopt = new Option("j", "Jars to include");
        jopt.setLongOpt("java");
        jopt.setArgs(Option.UNLIMITED_VALUES);
        options.addOption(jopt);

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println("Invalid usage");
            new HelpFormatter().printHelp("tvm", options);
            System.exit(1);
        }

        String path;
        if (cmd.hasOption("i")) {
            path = cmd.getOptionValue("i");
        } else {
            path = cmd.getArgs()[0];
        }

        byte[] data = FileUtils.readFileToByteArray(new File(path));

        int idex = 0;
        ArrayList<Byte> obj = new ArrayList<>();
        for (byte i : data) {
            obj.add(i);
        }
        ArrayList<String> paths = new ArrayList<>();
        if (cmd.hasOption("p")) {
            paths.add(new File(cmd.getOptionValue("p")).getCanonicalPath());
        }

        ArrayList<String> jars = new ArrayList<>();
        if (cmd.hasOption("j")) {
            jars = new ArrayList<>(Arrays.asList(cmd.getOptionValues("j")));
        }

        execute(obj, paths, jars);
    }

    public static void execute(ArrayList<Byte> code, ArrayList<String> paths, ArrayList<String> jars) throws Throwable {
        ArrayList<URL> jurls = new ArrayList<>();

        for (String i : jars) {
            jurls.add(new File(i).toURI().toURL());
        }

        URLClassLoader child = new URLClassLoader(
                jurls.toArray(new URL[0]),
                jurls.getClass().getClassLoader()
        );

        Reader.INSTANCE = new Reader(code);
        Executor executor = new Executor(Reader.INSTANCE);
        executor.ENVIRONMENT.SEARCH_PATHS.addAll(paths);
        try {
            executor.execute();
        } catch (T2LError e) {
            Log.Error(e.getMessage());
            STACK = e.getStackTrace();
            if (e.SOURCE != null) {
                STACK = e.SOURCE.getStackTrace();
                throw e.SOURCE;
            }
            System.exit(1);
        } catch (Throwable e) { // Catch everything except NPE for some reason
            Log.Error("An internal error has occured on line " + executor.CURRENT_LINE);
            throw e;
        }
    }
}
