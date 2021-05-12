package io.github.kinderhead.T2L.debugging;

public class RemoteDebugger {
    public static RemoteDebugger INSTANCE = new RemoteDebugger();
    public boolean IS_CONNECTED = false;
    public boolean STATIC_CONNECTION = false;

    public boolean isConnected() {
        return IS_CONNECTED;
    }

    public int getLine(int num) {
        return num;
    }
    public int getColumn(int num) {
        return num;
    }
}
