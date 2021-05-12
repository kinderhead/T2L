package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.ast.ExprCodes;
import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Reader;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.T2LTypes;
import io.github.kinderhead.T2L.execution.builtins.Bool;

public class ExprInsn extends Instruction implements PassableInstruction {
    private ExprCodes OP;

    public ExprInsn() {

    }

    public ExprInsn(ExprCodes op) {
        OP = op;
    }

    @Override
    public void serialize(Builder builder) {
        builder.emit(OP.TYPE);
    }

    @Override
    public void deserialize(Reader reader) {
        double num = reader.getInt();

        for (ExprCodes code: ExprCodes.values()) {
            if (code.TYPE == (int) num) {
                OP = code;
            }
        }
    }

    @Override
    public void execute(Executor executor) {
        T2LObject left = executor.ENVIRONMENT.pop();
        T2LObject right = executor.ENVIRONMENT.pop();

        boolean out = false;
        double num_out = 0;
        boolean is_bool = true;

        switch (OP) {
            case AND:
                out = left.isTrue() && right.isTrue();
                break;
            case OR:
                out = left.isTrue() || right.isTrue();
                break;
            case EQ:
                out = left.equals(right, executor);
                break;
            case NEQ:
                out = !left.equals(right, executor);
                break;
            case LT:
                out = left.lessThan(right, executor);
                break;
            case GT:
                out = left.greaterThan(right, executor);
                break;
            case GTEQ:
                out = left.greaterThan(right, executor) || left.equals(right, executor);
                break;
            case LTEQ:
                out = left.lessThan(right, executor) || left.equals(right, executor);
                break;
            case ADD:
                if (left.TYPE == T2LTypes.STRING && left.isTypeEqual(right)) {
                    T2LObject ret = new T2LObject(T2LTypes.STRING);
                    ret.STRING = left.STRING + right.STRING;
                    executor.ENVIRONMENT.push(ret);
                    return;
                }
                num_out = left.add(right, executor);
                is_bool = false;
                break;
            case SUB:
                num_out = left.sub(right, executor);
                is_bool = false;
                break;
            case MUL:
                num_out = left.mul(right, executor);
                is_bool = false;
                break;
            case DIV:
                num_out = left.div(right, executor);
                is_bool = false;
                break;
            case MOD:
                num_out = left.mod(right, executor);
                is_bool = false;
                break;
            case POW:
                num_out = left.pow(right, executor);
                is_bool = false;
                break;
        }

        if (is_bool) {
            executor.ENVIRONMENT.push(new Bool(out));
        } else {
            T2LObject ret = new T2LObject(T2LTypes.INT);
            ret.NUMBER = num_out;
            executor.ENVIRONMENT.push(ret);
        }
    }

    @Override
    public OpCodes getOpcode() {
        return OpCodes.EXPR;
    }

    @Override
    public T2LObject getValue(Executor executor) {
        return null;
    }
}
