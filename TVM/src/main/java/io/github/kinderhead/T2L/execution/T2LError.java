package io.github.kinderhead.T2L.execution;

import io.github.kinderhead.T2L.console.Log;
import io.github.kinderhead.T2L.debugging.T2LDebugger;

public class T2LError extends RuntimeException {
    private String TEXT;
    private String TYPE;
    private int LINE;
    private int COL = -1;
    public static int COUNT = 0;
    public Throwable SOURCE;

    public T2LError(String txt, int line, String type) {
        super(getT2LMessage(line, -1, txt));
        TEXT = txt;
        LINE = line;
        TYPE = type;
    }

    public T2LError(String txt, int line, int col, String type) {
        super(getT2LMessage(line, col, txt));
        TEXT = txt;
        LINE = line;
        COL = col;
        TYPE = type;
    }

    public T2LError(String txt) {
        super(getT2LMessage(-1, -1, txt));
        TEXT = txt;
        LINE = -1;
    }

    private static String getT2LMessage(int LINE, int COL, String TEXT) {
        if (T2LDebugger.INSTANCE.isConnected() && LINE != -1) {
            if (COL == -1) {
                return TEXT + " | On line: " + T2LDebugger.INSTANCE.getLine(LINE);
            } else {
                return TEXT + " | On line: " + T2LDebugger.INSTANCE.getLine(LINE) + ":" + T2LDebugger.INSTANCE.getColumn(COL);
            }
        } else {
            return TEXT;
        }
    }

    public void runWithoutFail() {
        Log.Error(getT2LMessage(LINE, COL, TEXT));
        COUNT++;
    }

    public void run() {
        throw this;
        //runWithoutFail();
        //System.exit(1);
    }

    public static void complete() {
        if (T2LError.COUNT != 0) {
            Log.Error("Reached " + T2LError.COUNT + " fatal error(s). Fix them to continue");
            System.exit(1);
        }
    }
}
