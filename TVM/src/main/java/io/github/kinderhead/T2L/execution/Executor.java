package io.github.kinderhead.T2L.execution;

import io.github.kinderhead.T2L.tvm.Instruction;

import java.util.ArrayList;

/**
 * The execution engine for all code.
 */
public class Executor {
    private final Reader READER;

    public ArrayList<Instruction> CODE;
    public final Environment ENVIRONMENT;
    public int CURRENT_ENVIRONMENT;
    public int CURRENT_LINE;
    public boolean RETURNING;
    public boolean RETURNING_VALUE;

    /**
     * Creates an executor with a reader.
     * Should only be used as the first executor.
     *
     * @param reader A reader
     * @see Reader
     */
    public Executor(Reader reader) {
        READER = reader;
        CODE = reader.read();
        ENVIRONMENT = new Environment();
        ENVIRONMENT.populateBase(this);
    }

    /**
     * Creates an executor with environment.
     *
     * @param env The environment
     * @see Environment
     */
    public Executor(Environment env, Executor executor) {
        ENVIRONMENT = env;
        READER = executor.READER;
    }

    /**
     * Start executing all {@link Instruction}s in property {@link Executor#CODE}.
     *
     * @see Instruction
     */
    public void execute() {
        for (Instruction insn : CODE) {
            runInsn(insn);
            if (RETURNING) {
                break;
            }
        }
    }

    /**
     * Runs a singular instruction.
     *
     * @param insn The instruction to run
     * @see Instruction
     */
    public void runInsn(Instruction insn) {
        CURRENT_LINE = READER.getLine(insn.getNumber() + 1);
        //System.out.println("Execution insn " + insn.getClass().getName() + " at env " + CURRENT_ENVIRONMENT);
        insn.execute(this);
    }
}
