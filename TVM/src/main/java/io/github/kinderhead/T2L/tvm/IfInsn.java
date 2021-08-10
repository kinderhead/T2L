package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.ast.ElseIfStat;
import io.github.kinderhead.T2L.ast.Statement;
import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Function;
import io.github.kinderhead.T2L.execution.Reader;
import io.github.kinderhead.T2L.execution.T2LObject;

import java.util.ArrayList;

public class IfInsn extends Instruction {
    private ArrayList<Statement> BODY;
    private ArrayList<Instruction> INSNS;
    private ArrayList<Statement> ELSE;
    private ArrayList<Instruction> ELSE_INSNS;
    private ArrayList<ElseIfStat> ELSEIF;
    private ArrayList<Instruction> ELSEIF_INSNS;

    public IfInsn() {

    }

    public IfInsn(ArrayList<Statement> body, ArrayList<Statement> else_stat, ArrayList<ElseIfStat> elseif) {
        BODY = body;
        ELSE = else_stat;
        ELSEIF = elseif;
    }

    @Override
    public void serialize(Builder builder) {
        builder.emitStatementArray(BODY);
        builder.emit(ELSE != null);
        if (ELSE != null) {
            builder.emitStatementArray(ELSE);
        }

        builder.emit(ELSEIF != null);
        if (ELSEIF != null) {
            builder.emitStatementArray(((ArrayList<Statement>)(ArrayList<?>) ELSEIF));
        }
    }

    @Override
    public void deserialize(Reader reader) {
        INSNS = reader.getInsns();
        ELSE_INSNS = null;
        boolean is_else = reader.getBool();
        if (is_else) {
            ELSE_INSNS = reader.getInsns();
        }

        boolean is_elseif = reader.getBool();
        if (is_elseif) {
            ELSEIF_INSNS = reader.getInsns();
        }
    }

    @Override
    public void execute(Executor executor) {
        T2LObject expr = executor.ENVIRONMENT.pop();
        if (expr.isTrue()) {
            Function body_func = new Function(executor.CURRENT_ENVIRONMENT);
            body_func.CODE = INSNS;
            body_func.run(null, new ArrayList<>(), executor);
        } else {
            if (ELSEIF_INSNS != null || ELSEIF_INSNS.size() != 0) {
                for (Instruction i : ELSEIF_INSNS) {
                    ElseIfInsn obj = (ElseIfInsn) i;
                    if (obj.eval(executor).isTrue()) {
                        Function body_func = new Function(executor.CURRENT_ENVIRONMENT);
                        body_func.CODE = obj.INSNS;
                        body_func.run(null, new ArrayList<>(), executor);
                        return;
                    }
                }
            }

            if (ELSE_INSNS != null) {
                Function body_func = new Function(executor.CURRENT_ENVIRONMENT);
                body_func.CODE = ELSE_INSNS;
                body_func.run(null, new ArrayList<>(), executor);
            }
        }
    }

    @Override
    public OpCodes getOpcode() {
        return OpCodes.IF;
    }
}
