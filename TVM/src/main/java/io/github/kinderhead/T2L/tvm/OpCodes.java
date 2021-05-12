package io.github.kinderhead.T2L.tvm;

public enum OpCodes {
    CALL((byte) 0x01),
    VALUE((byte) 0x02),
    PUSH((byte) 0x03),
    POP((byte) 0x04),
    VAR((byte) 0x05),
    ID((byte) 0x06),
    EXPR((byte) 0x07),
    IF((byte) 0x08),
    DEF((byte) 0x09),
    RETURN((byte) 0x10),
    CLASS((byte) 0x11),
    INIT((byte) 0x12),
    LIST((byte) 0x13),
    FOR((byte) 0x14),
    ELSEIF((byte) 0x15),
    DICT((byte) 0x16);

    public final byte BYTE;
    OpCodes(byte i) {
        this.BYTE = i;
    }
}
