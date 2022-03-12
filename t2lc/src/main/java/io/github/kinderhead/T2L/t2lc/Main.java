package io.github.kinderhead.T2L.t2lc;

import io.github.kinderhead.T2L.ANTLR.t2lLexer;
import io.github.kinderhead.T2L.ANTLR.t2lParser;
import io.github.kinderhead.T2L.ErrorListener;
import io.github.kinderhead.T2L.Visitor;
import io.github.kinderhead.T2L.ast.StatementGroup;
import io.github.kinderhead.T2L.debugging.T2LDebugger;
import io.github.kinderhead.T2L.execution.T2LError;
import io.github.kinderhead.T2L.tvm.CodeGen;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Options options = new Options();

        options.addOption("o", "output", true, "Output file");
        options.addOption("i", "infile", true, "Input file");
        options.addOption("d", "directory", false, "Compiles all files in a directory to another directory");
        options.addOption("m", "module", false, "Uses extension .t2lm for modules");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println("Invalid usage");
            new HelpFormatter().printHelp("t2lc", options);
            System.exit(1);
        }

        String ext = ".t2lc";
        if (cmd.hasOption("m")) {
            ext = ".t2lm";
        }

        String out;
        if (cmd.hasOption("d")) {
            out = "out";
        } else {
            out = "out.t2lc";
        }

        if (cmd.hasOption("o")) {
            out = cmd.getOptionValue("o");
        }

        String path;
        if (cmd.hasOption("i")) {
            path = cmd.getOptionValue("i");
        } else {
            path = cmd.getArgs()[0];
        }

        ArrayList<String> paths = new ArrayList<>();
        if (!cmd.hasOption("d")) {
            if (!new File(path).exists()) {
                System.out.println("Cannot find file " + path);
                new HelpFormatter().printHelp("t2lc", options);
                System.exit(1);
            }
            paths.add(FilenameUtils.removeExtension(path));
        } else {
            for (File i : new File(path).listFiles()) {
                if (i.getName().split("\\.")[i.getName().split("\\.").length - 1].equals("t2l")) {
                    paths.add(FilenameUtils.removeExtension(i.getName()));
                }
            }
        }

        if (cmd.hasOption("d")) {
            System.out.println("Compiling to directory " + out);
            new File(out).mkdirs();
        } else {
            System.out.println("Compiling to outfile " + out);
        }

        HashMap<String, byte[]> codes = new HashMap<>();
        for (String p : paths) {
            String code;
            if (cmd.hasOption("d")) {
                code = FileUtils.readFileToString(new File(path + p + ".t2l"), StandardCharsets.UTF_8);
            } else {
                code = FileUtils.readFileToString(new File(p + ".t2l"), StandardCharsets.UTF_8);
            }

            ArrayList<Byte> bytes = compile(code);
            byte[] ret = new byte[bytes.size()];
            Iterator<Byte> iterator = bytes.iterator();
            for (int i = 0; i < ret.length; i++)
            {
                ret[i] = iterator.next();
            }
            if (cmd.hasOption("d")) {
                codes.put(p, ret);
                //System.out.println("Compiling file " + path + p + ".t2l");
            } else {
                codes.put(out, ret);
            }
            //FileUtils.writeByteArrayToFile(new File(out), ret);
        }

        for (Map.Entry<String, byte[]> i : codes.entrySet()){
            if (cmd.hasOption("d")) {
                FileUtils.writeByteArrayToFile(new File(out + "/" + i.getKey() + ext), i.getValue());
            } else {
                FileUtils.writeByteArrayToFile(new File(i.getKey()), i.getValue());
            }
        }
    }

    public static ArrayList<Byte> compile(String code) {
        T2LDebugger.INSTANCE.IS_CONNECTED = true;
        T2LDebugger.INSTANCE.STATIC_CONNECTION = true;

        t2lLexer lexer = new t2lLexer(CharStreams.fromString(code));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ErrorListener());

        TokenStream tokens = new CommonTokenStream(lexer);

        t2lParser parser = new t2lParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListener());
        t2lParser.StartContext ctx =  parser.start();

        T2LError.complete();

        Visitor visitor = new Visitor();
        StatementGroup group = (StatementGroup) visitor.visit(ctx);
        CodeGen codeGen = new CodeGen(group);

        T2LError.complete();

        return codeGen.getCode();
    }
}
