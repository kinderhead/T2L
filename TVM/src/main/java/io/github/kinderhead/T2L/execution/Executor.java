package io.github.kinderhead.T2L.execution;

import io.github.kinderhead.T2L.tvm.Instruction;

import java.util.ArrayList;

public class Executor {
    private final Reader READER;

    public ArrayList<Instruction> CODE;
    public final Environment ENVIRONMENT;
    public int CURRENT_ENVIRONMENT;
    public int CURRENT_LINE;
    public boolean RETURNING;
    public boolean RETURNING_VALUE;

    public Executor(Reader reader) {
        READER = reader;
        CODE = reader.read();
        ENVIRONMENT = new Environment();
        ENVIRONMENT.populateBase(this);
    }

    public Executor(Environment env) {
        ENVIRONMENT = env;
        READER = null;
    }

    public void execute() {
        for (Instruction insn : CODE) {
            runInsn(insn);
            if (RETURNING) {
                break;
            }
        }
    }

    public void runInsn(Instruction insn) {
        CURRENT_LINE = Reader.INSTANCE.getLine(insn.getNumber());
        //System.out.println("Execution insn " + insn.getClass().getName() + " at env " + CURRENT_ENVIRONMENT);
        insn.execute(this);
    }
}
