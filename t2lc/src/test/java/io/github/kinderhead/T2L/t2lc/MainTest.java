package io.github.kinderhead.T2L.t2lc;

import io.github.kinderhead.T2L.tvm.Main;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.security.Permission;

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
    void runFile() throws IOException {
        System.setSecurityManager(new SecurityManager() {

            @Override
            public void checkPermission(Permission perm)
            {
            }

            @Override
            public void checkExit(int status)
            {
                if (status != 0) {
                    throw new SecurityException();
                }
            }

        });

        io.github.kinderhead.T2L.t2lc.Main.main(new String[]{"-i", "../src/test/t2l/test.t2l", "-o", "../src/dist/stdlib/test.t2lc"});
        /*
        Main.main(new String[]{"-o", "../lib/core.t2lm", "../lib/core.t2l"});
        Main.main(new String[]{"-o", "../lib/test.t2lc", "../lib/test.t2l"});

         */
        Main.main(new String[]{"-i", "../src/dist/stdlib/test.t2lc", "-p", "../src/dist/stdlib"});

        //io.github.kinderhead.T2L.tvm.Main.execute(Main.compile(String.join("\n", Files.readAllLines(Paths.get(getClass().getResource("/test.t2l").toURI()))), "out.t2lc"));
    }
}