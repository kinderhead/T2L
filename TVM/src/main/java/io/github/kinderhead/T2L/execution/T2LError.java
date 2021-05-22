package io.github.kinderhead.T2L.execution;

import io.github.kinderhead.T2L.console.Log;
import io.github.kinderhead.T2L.debugging.T2LDebugger;

/**
 * The internal error type. Catch this for any T2L errors.
 *
 * @see io.github.kinderhead.T2L.execution.errors.T2LException
 */
public class T2LError extends RuntimeException {
    private String TEXT;
    private String TYPE;
    private int LINE;
    private int COL = -1;
    public static int COUNT = 0;
    public Throwable SOURCE;

    /**
     * Create the error. For use with {@link io.github.kinderhead.T2L.execution.errors.T2LException}
     *
     * @param txt The message
     * @param line The line
     * @param type The type
     */
    public T2LError(String txt, int line, String type) {
        super(getT2LMessage(line, -1, txt));
        TEXT = txt;
        LINE = line;
        TYPE = type;
    }

    /**
     * Create the error.
     *
     * @param txt The message
     * @param line The line
     * @param col The column
     * @param type The type
     */
    public T2LError(String txt, int line, int col, String type) {
        super(getT2LMessage(line, col, txt));
        TEXT = txt;
        LINE = line;
        COL = col;
        TYPE = type;
    }

    /**
     * Create a basic error.
     *
     * @param txt The message
     */
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

    /**
     * Just print the error to the console.
     * Mostly used only by the compiler.
     */
    public void runWithoutFail() {
        Log.Error(getT2LMessage(LINE, COL, TEXT));
        COUNT++;
    }

    /**
     * Throw the error.
     */
    public void run() {
        throw this;
        //runWithoutFail();
        //System.exit(1);
    }

    /**
     * If any errors occured, stop the program.
     * For use with the compiler.
     */
    public static void complete() {
        if (T2LError.COUNT != 0) {
            Log.Error("Reached " + T2LError.COUNT + " fatal error(s). Fix them to continue");
            System.exit(1);
        }
    }
}
