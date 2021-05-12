package io.github.kinderhead.T2L.verification;

import io.github.kinderhead.T2L.tvm.CallInsn;

public class VerifyInsn {
    public static boolean verifyCall(CallInsn insn, String name) {
        int checks = 0;

        checks += ((insn.NAME.equals(name)) ? 1 : 0);

        return checks == 2;
    }
}
