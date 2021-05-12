package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.ast.IVisitorAST;
import io.github.kinderhead.T2L.ast.Statement;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Builder {
    public ArrayList<Byte> CODE = new ArrayList<>();

    public void emit(Instruction insn) {
        CODE.add(insn.getOpcode().BYTE);
        insn.serialize(this);
    }

    public void emit(String string) {
        string = string.replaceAll("\"$", "").replaceAll("^\"", "");

        for (byte i: string.getBytes(StandardCharsets.UTF_8)) {
            CODE.add(i);
        }
        CODE.add((byte) 0x00);
    }

    public void emit(double num) {
        for (byte i: ByteBuffer.wrap(new byte[8]).putDouble(num).array()) {
            CODE.add(i);
        }
    }

    public void emit(byte i) {
        CODE.add(i);
    }

    public void emit(boolean bool) {
        if (bool) {
            CODE.add((byte) 0x01);
        } else {
            CODE.add((byte) 0x00);
        }
    }

    public void emitStatementArray(List<Statement> objs) {
        for (IVisitorAST i : objs) {
            i.compile(this);
        }
        emit((byte)0xFF);
    }

    public void emitStringArray(List<String> objs) {
        for (String i : objs) {
            emit(i);
        }
        emit((byte)0xFF);
    }
}
