package io.github.kinderhead.T2L.execution;

import io.github.kinderhead.T2L.console.Log;
import io.github.kinderhead.T2L.tvm.CallInsn;
import io.github.kinderhead.T2L.tvm.ClassInitInsn;
import io.github.kinderhead.T2L.tvm.ClassInsn;
import io.github.kinderhead.T2L.tvm.DictionaryInsn;
import io.github.kinderhead.T2L.tvm.ElseIfInsn;
import io.github.kinderhead.T2L.tvm.ExprInsn;
import io.github.kinderhead.T2L.tvm.ForLoopInsn;
import io.github.kinderhead.T2L.tvm.FuncInsn;
import io.github.kinderhead.T2L.tvm.IDInsn;
import io.github.kinderhead.T2L.tvm.IfInsn;
import io.github.kinderhead.T2L.tvm.Instruction;
import io.github.kinderhead.T2L.tvm.ListInsn;
import io.github.kinderhead.T2L.tvm.OpCodes;
import io.github.kinderhead.T2L.tvm.PopInsn;
import io.github.kinderhead.T2L.tvm.PushInsn;
import io.github.kinderhead.T2L.tvm.ReturnInsn;
import io.github.kinderhead.T2L.tvm.ValueInsn;
import io.github.kinderhead.T2L.tvm.VarInsn;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Reader {
    private ArrayList<Byte> CODE;
    private int INDEX = 0;
    private int NEXT_NUMBER = 0;

    private ArrayList<Class<Instruction>> INSNS = new ArrayList(Arrays.asList(
            ValueInsn.class,
            CallInsn.class,
            PushInsn.class,
            PopInsn.class,
            VarInsn.class,
            IDInsn.class,
            ExprInsn.class,
            IfInsn.class,
            FuncInsn.class,
            ReturnInsn.class,
            ClassInsn.class,
            ClassInitInsn.class,
            ListInsn.class,
            ForLoopInsn.class,
            ElseIfInsn.class,
            DictionaryInsn.class
    ));

    public Reader(ArrayList<Byte> code) {
        CODE = code;
    }

    public ArrayList<Instruction> read() {
        ArrayList<Instruction> out = new ArrayList<>();

        while (INDEX != CODE.size()) {
            out.add(getInsn());
        }

        return out;
    }

    public Instruction getInsn() {
        Instruction insn = null;
        byte opcode = getByte();

        for (OpCodes i: OpCodes.values()) {
            if (i.BYTE == opcode) {
                for (Class<Instruction> clazz: INSNS) {
                    try {
                        insn = clazz.newInstance();
                        if (insn.getOpcode() == i) {
                            insn.setNumber(NEXT_NUMBER);
                            NEXT_NUMBER++;
                            insn.deserialize(this);
                            break;
                        } else {
                            insn = null;
                        }
                    } catch (InstantiationException | IllegalAccessException e) {
                        Log.Error("Cannot get default constructor for " + clazz.getName());
                    }
                }
            }
        }
        if (insn == null && opcode != 0) {
            Log.Error("Cannot generate insn with opcode " + opcode);
        }
        return insn;
    }

    public String getString() {
        String out = "";
        byte next = getByte();

        while (next != 0x00) {
            out = out + new String(new byte[]{next}, StandardCharsets.UTF_8);
            next = getByte();
        }

        return out;
    }

    public double getInt() {
        byte[] arr = new byte[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = getByte();
        }

        return ByteBuffer.wrap(arr).getDouble();
    }

    public byte getByte() {
        if (INDEX != CODE.size()) {
            byte out = CODE.get(INDEX);
            INDEX++;
            return out;
        }
        return 0;
    }

    public byte peekByte() {
        if (INDEX != CODE.size()) {
            return CODE.get(INDEX);
        }
        return 0;
    }

    public boolean getBool() {
        byte b = getByte();
        return b == (byte) 0x01;
    }

    public ArrayList<Instruction> getInsns() {
        ArrayList<Instruction> insns = new ArrayList<>();
        byte peek = peekByte();
        while (peek != (byte) 0xFF) {
            insns.add(getInsn());
            peek = peekByte();
        }
        getByte();
        return insns;
    }

    public ArrayList<String> getStrings() {
        ArrayList<String> strings = new ArrayList<>();
        byte peek = peekByte();
        while (peek != (byte) 0xFF) {
            strings.add(getString());
            peek = peekByte();
        }
        getByte();
        return strings;
    }
}
