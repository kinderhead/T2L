package io.github.kinderhead.T2L.t2lc;

import io.github.kinderhead.T2L.api.T2LApi;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

class MainTest {
    /*
    @Test
    @DisplayName("Compile var and reference")
    void compileVar() {
        ArrayList<Byte> out = Main.compile("x = \"Hi\";\nprint(x);", "out.t2lc");

        Assertions.assertArrayEquals(new Byte[] {3, 2, 1, 72, 105, 0, 5, 120, 0, 3, 6, 120, 0, 1, 112, 114, 105, 110, 116, 0},
                out.toArray(new Byte[0]));
    }

    @Test
    @DisplayName("Compile print")
    void compilePrint() {
        ArrayList<Byte> out = Main.compile("print(\"TEsT\");", "out.t2lc");
        System.out.println(out);

        Assertions.assertArrayEquals(new Byte[] {3, 2, 1, 84, 69, 115, 84, 0, 1, 112, 114, 105, 110, 116, 0},
                out.toArray(new Byte[0]));
    }
     */

    @Test
    void runFile() throws Throwable {
        io.github.kinderhead.T2L.t2lc.Main.main(new String[]{"-d", "-m", "-o", "../src/dist/stdlib/", "-i", "../src/main/t2l/"});
        //io.github.kinderhead.T2L.t2lc.Main.main(new String[]{"-i", "../src/test/t2l/test.t2l", "-o", "../src/dist/stdlib/test.t2lc"});

        //Main.main(new String[]{"-i", "../src/dist/stdlib/test.t2lc", "-p", "../src/dist/stdlib", "-j", "../out/t2lc.jar"});
        T2LApi t2l = new T2LApi();
        t2l.linkJars(new ArrayList<>(Collections.singleton("../out/t2lc.jar")));
        t2l.loadCode(FileUtils.readFileToString(new File("../src/test/t2l/test.t2l"), StandardCharsets.UTF_8));
        t2l.execute();

        t2l.run("test", "hello");

        //io.github.kinderhead.T2L.tvm.Main.execute(Main.compile(String.join("\n", Files.readAllLines(Paths.get(getClass().getResource("/test.t2l").toURI()))), "out.t2lc"));
    }
}