package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.ast.Statement;
import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Reader;
import io.github.kinderhead.T2L.execution.T2LClass;

import java.util.ArrayList;

public class ClassInsn extends Instruction {
    private String NAME;
    private ArrayList<String> INHERITANCE;
    private ArrayList<Statement> BODY;
    private ArrayList<Instruction> RUNTIME_BODY;

    public ClassInsn() {

    }

    public ClassInsn(String name, ArrayList<String> inheritance, ArrayList<Statement> body) {
        NAME = name;
        INHERITANCE = inheritance;
        BODY = body;
    }

    @Override
    public void serialize(Builder builder) {
        builder.emit(NAME);
        builder.emitStringArray(INHERITANCE);
        builder.emitStatementArray(BODY);
    }

    @Override
    public void deserialize(Reader reader) {
        NAME = reader.getString();
        INHERITANCE = reader.getStrings();
        RUNTIME_BODY = reader.getInsns();
    }

    @Override
    public void execute(Executor executor) {
        Executor new_executor = new Executor(executor.ENVIRONMENT, executor);
        new_executor.CURRENT_ENVIRONMENT = executor.ENVIRONMENT.newEnvironment(executor.CURRENT_ENVIRONMENT);

        for (Instruction i : RUNTIME_BODY) {
            new_executor.runInsn(i);
        }

        T2LClass obj = new T2LClass();

        for (String i : INHERITANCE) {
            obj.inherit(environmentGetErrorHandler(executor.CURRENT_ENVIRONMENT, i, executor));
        }

        obj.build(new_executor.ENVIRONMENT.ENVIRONMENTS.get(new_executor.CURRENT_ENVIRONMENT).OBJECTS);
        new_executor.ENVIRONMENT.ENVIRONMENTS.get(new_executor.CURRENT_ENVIRONMENT).OBJECTS.clear();
        obj.NAME = NAME;
        new_executor.ENVIRONMENT.set(executor.CURRENT_ENVIRONMENT, NAME, obj, executor);
    }

    @Override
    public OpCodes getOpcode() {
        return OpCodes.CLASS;
    }
}
