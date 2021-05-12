package io.github.kinderhead.T2L.ast;

public enum ExprCodes {
    AND(0),
    OR(1),
    EQ(2),
    NEQ(3),
    LT(4),
    GT(5),
    GTEQ(6),
    LTEQ(7),

    ADD(8),
    SUB(9),
    MUL(10),
    DIV(11),
    MOD(12),
    POW(13);

    public int TYPE;
    ExprCodes(int type) {
        TYPE = type;
    }
}
