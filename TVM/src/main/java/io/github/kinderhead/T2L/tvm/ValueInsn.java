package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.Reader;
import io.github.kinderhead.T2L.execution.T2LObject;
import io.github.kinderhead.T2L.execution.T2LTypes;

public class ValueInsn extends Instruction implements PassableInstruction {
    private final byte STR_TYPE = 0x01;
    private final byte INT_TYPE = 0x02;

    private String string;
    private double num;
    private String type;

    public ValueInsn() {

    }

    public ValueInsn(String value) {
        string = value;
        type = "string";
    }

    public ValueInsn(double value) {
        num = value;
        type = "int";
    }

    @Override
    public void serialize(Builder builder) {
        if (type == "string") {
            builder.emit(STR_TYPE);
            builder.emit(string);
        } else {
            builder.emit(INT_TYPE);
            builder.emit(num);
        }
    }

    @Override
    public void deserialize(Reader reader) {
        byte b_type = reader.getByte();
        if (b_type == STR_TYPE) {
            type = "string";
            string = reader.getString();
        } else {
            type = "int";
            num = reader.getInt();
        }
    }

    @Override
    public void execute(Executor executor) {

    }

    @Override
    public OpCodes getOpcode() {
        return OpCodes.VALUE;
    }

    @Override
    public T2LObject getValue(Executor executor) {
        T2LObject out;
        if (type.equals("string")) {
            out = new T2LObject(T2LTypes.STRING);
            out.STRING = string;
        } else {
            out = new T2LObject(T2LTypes.INT);
            out.NUMBER = num;
        }
        return out;
    }
}
