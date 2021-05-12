package io.github.kinderhead.T2L.execution;

import io.github.kinderhead.T2L.console.Log;
import io.github.kinderhead.T2L.debugging.RemoteDebugger;

public class T2LError {
    private String TEXT;
    private int LINE;
    private int COL = -1;
    public static int COUNT = 0;

    public T2LError(String txt, int line) {
        TEXT = txt;
        LINE = line;
    }

    public T2LError(String txt, int line, int col) {
        TEXT = txt;
        LINE = line;
        COL = col;
    }

    public T2LError(String txt) {
        TEXT = txt;
        LINE = -1;
    }

    public void runWithoutFail() {
        if (RemoteDebugger.INSTANCE.isConnected() && LINE != -1) {
            if (COL == -1) {
                Log.Error(TEXT + " | On line: " + RemoteDebugger.INSTANCE.getLine(LINE));
            } else {
                Log.Error(TEXT + " | On line: " + RemoteDebugger.INSTANCE.getLine(LINE) + ":" + RemoteDebugger.INSTANCE.getColumn(COL));
            }
        } else {
            Log.Error(TEXT);
        }
        COUNT++;
    }

    public void run() {
        runWithoutFail();
        System.exit(1);
    }

    public static void complete() {
        if (T2LError.COUNT != 0) {
            Log.Error("Reached " + T2LError.COUNT + " fatal error(s). Fix them to continue");
            System.exit(1);
        }
    }
}
