package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.VarInsn;

import java.util.Random;

public class PropertyAST implements IVisitorAST {
    public int LINE;
    public IVisitorAST LEFT;
    public IVisitorAST RIGHT;

    public PropertyAST(int line, IVisitorAST left, IVisitorAST right) {
        LINE = line;
        LEFT = left;
        RIGHT = right;
    }

    @Override
    public int getLine() {
        return LINE;
    }

    @Override
    public Statements getType() {
        return Statements.PROPERTY;
    }

    @Override
    public void compile(Builder builder) {
        String newName = "_intern_value_v" + new Random().nextInt(100000);

        LEFT.compile(builder);
        builder.emit(new VarInsn(newName));

        ((PropertyGetterAST) RIGHT).setName(newName + "." + ((PropertyGetterAST) RIGHT).getName());
        RIGHT.compile(builder);
    }
}
