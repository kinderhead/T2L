package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.ast.IVisitorAST;
import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Reader;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.errors.ParameterException;

import java.util.ArrayList;
import java.util.Collections;

public class CallInsn extends Instruction {
    public String NAME;
    public ArrayList<IVisitorAST> PARAMS;
    public double SIZE;
    public boolean USING_RET;

    public CallInsn() {

    }

    public CallInsn(String name, ArrayList<IVisitorAST> params, boolean using_ret) {
        NAME = name;
        PARAMS = params;
        USING_RET = using_ret;
    }

    @Override
    public void serialize(Builder builder) {
        builder.emit(NAME);
        builder.emit(PARAMS.size());
        builder.emit(USING_RET);
    }

    @Override
    public void deserialize(Reader reader) {
        NAME = reader.getString();
        SIZE = reader.getInt();
        USING_RET = reader.getBool();
    }

    @Override
    public void execute(Executor executor) {
        T2LObject func = environmentGetErrorHandler(executor.CURRENT_ENVIRONMENT, NAME, executor);
        int num = func.PARAMS.size();
        ArrayList<T2LObject> objs = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            objs.add(executor.ENVIRONMENT.pop());
        }
        Collections.reverse(objs);

        if (SIZE != num && !func.UNLIMITED_PARAMS) {
            new ParameterException().raise("Expected " + func.PARAMS.size() + " parameter(s) instead got " + (int)SIZE + ". At function call " + func.NAME + "@" + System.identityHashCode(func), executor.CURRENT_LINE);
        }

        T2LObject ret;

        if (!NAME.contains(".")) {
            ret = environmentGetErrorHandler(executor.CURRENT_ENVIRONMENT, NAME, executor).run(null, objs, executor);
        } else {
            ArrayList<String> new_name = new ArrayList<>();
            String[] regex = NAME.split("\\.");
            int idex = 0;
            for (String i : regex) {
                if (idex == regex.length - 1) {
                    idex++;
                    continue;
                }
                new_name.add(i);
                idex++;
            }

            ret = environmentGetErrorHandler(executor.CURRENT_ENVIRONMENT, NAME, executor).run(executor.ENVIRONMENT.get(executor.CURRENT_ENVIRONMENT, String.join(".", new_name)), objs, executor);
        }

        if (USING_RET) {
            executor.ENVIRONMENT.push(ret);
        }
    }

    @Override
    public OpCodes getOpcode() {
        return OpCodes.CALL;
    }
}
