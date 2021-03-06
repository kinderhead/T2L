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
import io.github.kinderhead.T2L.tvm.PropertyInsn;
import io.github.kinderhead.T2L.tvm.PushInsn;
import io.github.kinderhead.T2L.tvm.ReturnInsn;
import io.github.kinderhead.T2L.tvm.ValueInsn;
import io.github.kinderhead.T2L.tvm.VarInsn;
import org.apache.commons.lang3.ArrayUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * The bytecode reader.
 */
public class Reader {
    private final ArrayList<Byte> CODE;
    private int INDEX = 0;
    private int NEXT_NUMBER = 0;

    private HashMap<Integer, Integer> LINES;
    private int last_line = 0;

    /**
     * All instructions must be registered here.
     */
    public List<Class<? extends Instruction>> INSNS = Arrays.asList(
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
            DictionaryInsn.class,
            PropertyInsn.class
    );

    /**
     * Creates the reader.
     *
     * @param code The code
     */
    @SuppressWarnings("unchecked")
    public Reader(ArrayList<Byte> code) {
        byte[] objarr = ArrayUtils.toPrimitive(code.toArray(new Byte[0]));

        ByteArrayInputStream bis = new ByteArrayInputStream(objarr);
        ObjectInput in;
        try {
            in = new ObjectInputStream(bis);
            LINES = (HashMap<Integer, Integer>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        CODE = new ArrayList<>(Arrays.asList(ArrayUtils.toObject(bis.readAllBytes())));

        try {
            bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Read all instructions.
     *
     * @return The instructions
     */
    public ArrayList<Instruction> read() {
        ArrayList<Instruction> out = new ArrayList<>();

        while (INDEX != CODE.size()) {
            out.add(getInsn());
        }

        return out;
    }

    /**
     * Get an instruction
     *
     * @return The instruction
     * @see io.github.kinderhead.T2L.tvm.Builder#emit(Instruction)
     */
    public Instruction getInsn() {
        Instruction insn = null;
        byte opcode = getByte();

        for (OpCodes i: OpCodes.values()) {
            if (i.BYTE == opcode) {
                for (Class<? extends Instruction> clazz: INSNS) {
                    try {
                        insn = clazz.getDeclaredConstructor().newInstance();
                        if (insn.getOpcode() == i) {
                            insn.setNumber(NEXT_NUMBER);
                            NEXT_NUMBER++;
                            insn.deserialize(this);
                            break;
                        } else {
                            insn = null;
                        }
                    } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                        Log.Error("Cannot get default constructor for " + clazz.getName());
                    }
                }
            }
        }
        if (insn == null) {
            Log.Error("Cannot generate insn with opcode " + opcode);
        }
        return insn;
    }

    /**
     * Get a string.
     *
     * @return The string
     * @see io.github.kinderhead.T2L.tvm.Builder#emit(String)
     */
    public String getString() {
        StringBuilder out = new StringBuilder();
        byte next = getByte();

        while (next != 0x00) {
            out.append(new String(new byte[]{next}, StandardCharsets.UTF_8));
            next = getByte();
        }

        return out.toString();
    }

    /**
     * Get a double.
     *
     * @return The number
     * @see io.github.kinderhead.T2L.tvm.Builder#emit(double)
     */
    public double getInt() {
        byte[] arr = new byte[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = getByte();
        }

        return ByteBuffer.wrap(arr).getDouble();
    }

    /**
     * Get a byte.
     *
     * @return The byte
     * @see io.github.kinderhead.T2L.tvm.Builder#emit(byte)
     */
    public byte getByte() {
        if (INDEX != CODE.size()) {
            byte out = CODE.get(INDEX);
            INDEX++;
            return out;
        }
        return 0;
    }

    /**
     * Peek at next byte.
     *
     * @return The byte
     */
    public byte peekByte() {
        if (INDEX != CODE.size()) {
            return CODE.get(INDEX);
        }
        return 0;
    }

    /**
     * Get a boolean.
     *
     * @return The bool
     * @see io.github.kinderhead.T2L.tvm.Builder#emit(boolean)
     */
    public boolean getBool() {
        byte b = getByte();
        return b == (byte) 0x01;
    }

    /**
     * Get instructions.
     * Stops after a <code>0xFF</code> byte.
     *
     * @return The instructions
     * @see io.github.kinderhead.T2L.tvm.Builder#emitASTArray(List)
     */
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

    /**
     * Get strings.
     * Stops after a <code>0xFF</code> byte.
     *
     * @return The strings
     * @see io.github.kinderhead.T2L.tvm.Builder#emitStringArray(List)
     */
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

    /**
     * Get the line of an instruction.
     *
     * @param num A number from {@link Instruction#getNumber()}
     * @return The line
     */
    public int getLine(int num) {
        if (LINES.containsKey(num)) {
            last_line = LINES.get(num);
            return LINES.get(num);
        }
        return last_line;
    }
}
