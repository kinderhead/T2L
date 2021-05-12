package io.github.kinderhead.T2L.console;

public class Log {
    public static void Success(String txt) {
        System.out.println("\u001B[32m" + txt + "\u001B[0m");
    }

    public static void Error(String txt) {
        System.out.println("\u001B[31m" + txt + "\u001B[0m");
    }
}
