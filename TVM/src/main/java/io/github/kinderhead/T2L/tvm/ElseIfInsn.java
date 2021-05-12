package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.ast.IVisitorAST;
import io.github.kinderhead.T2L.ast.Statement;
import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Reader;
import io.github.kinderhead.T2L.execution.T2LObject;

import java.util.ArrayList;
import java.util.Collections;

public class ElseIfInsn extends Instruction {
    private ArrayList<Statement> BODY;
    public ArrayList<Instruction> INSNS;
    private IVisitorAST EXPR;
    private ArrayList<Instruction> EXPR_INSN;

    public ElseIfInsn() {

    }

    public ElseIfInsn(ArrayList<Statement> body, IVisitorAST expr) {
        BODY = body;
        EXPR = expr;
    }

    @Override
    public void serialize(Builder builder) {
        builder.emitStatementArray(BODY);
        builder.emitStatementArray(((ArrayList<Statement>)(ArrayList<?>) new ArrayList<>(Collections.singletonList(EXPR))));
    }

    @Override
    public void deserialize(Reader reader) {
        INSNS = reader.getInsns();
        EXPR_INSN = reader.getInsns();
    }

    @Override
    public void execute(Executor executor) {

    }

    @Override
    public OpCodes getOpcode() {
        return OpCodes.ELSEIF;
    }

    public T2LObject eval(Executor executor) {
        for (Instruction i : EXPR_INSN) {
            i.execute(executor);
        }
        return executor.ENVIRONMENT.pop();
    }
}
