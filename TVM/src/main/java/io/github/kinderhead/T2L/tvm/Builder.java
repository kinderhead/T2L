package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.ast.IVisitorAST;
import io.github.kinderhead.T2L.execution.Reader;
import org.apache.commons.lang3.ArrayUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Builder class used by the compiler.
 */
public class Builder {
    public ArrayList<Byte> CODE = new ArrayList<>();
    public HashMap<Integer, Integer> LINES = new HashMap<>();

    private int cur_line = 0;

    /**
     * Add a line based on the instruction number.
     *
     * @param line The line
     */
    public void addLine(int line) {
        LINES.put(cur_line, line);
    }

    /**
     * Emit an instruction.
     *
     * @param insn The instruction
     * @see Reader#getInsn()
     */
    public void emit(Instruction insn) {
        CODE.add(insn.getOpcode().BYTE);
        insn.serialize(this);
        cur_line++;
    }

    /**
     * Emit a string.
     *
     * @param string The string
     * @see Reader#getString()
     */
    public void emit(String string) {
        string = string.replaceAll("\"$", "").replaceAll("^\"", "");

        for (byte i: string.getBytes(StandardCharsets.UTF_8)) {
            CODE.add(i);
        }
        CODE.add((byte) 0x00);
    }

    /**
     * Emit a double.
     *
     * @param num The number
     * @see Reader#getInt()
     */
    public void emit(double num) {
        for (byte i: ByteBuffer.wrap(new byte[8]).putDouble(num).array()) {
            CODE.add(i);
        }
    }

    /**
     * Emit a byte.
     *
     * @param i The byte
     * @see Reader#getByte() 
     */
    public void emit(byte i) {
        CODE.add(i);
    }

    /**
     * Emit a boolean.
     * 
     * @param bool The bool
     * @see Reader#getBool() 
     */
    public void emit(boolean bool) {
        if (bool) {
            CODE.add((byte) 0x01);
        } else {
            CODE.add((byte) 0x00);
        }
    }

    /**
     * Emit statements.
     * Ends with a <code>0xFF</code>.
     * 
     * @param objs The statements
     * @see Reader#getInsns()
     */
    public void emitASTArray(List<? extends IVisitorAST> objs) {
        for (IVisitorAST i : objs) {
            i.compile(this);
        }
        emit((byte)0xFF);
    }

    /**
     * Emit strings.
     * Ends with a <code>0xFF</code>.
     * 
     * @param objs The strings
     * @see Reader#getStrings() 
     */
    public void emitStringArray(List<String> objs) {
        for (String i : objs) {
            emit(i);
        }
        emit((byte)0xFF);
    }

    /**
     * Adds line number data to the beginning of the file.
     * 
     * @see Reader#getLine(int) 
     */
    public void finish() {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            ObjectOutputStream out = new ObjectOutputStream(bos);
            out.writeObject(LINES);
            out.flush();

            ArrayList<Byte> newCode = new ArrayList<>(Arrays.asList(ArrayUtils.toObject(bos.toByteArray())));
            newCode.addAll(CODE);
            CODE = newCode;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
