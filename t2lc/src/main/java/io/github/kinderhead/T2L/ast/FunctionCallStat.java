package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;
import io.github.kinderhead.T2L.tvm.CallInsn;

import java.util.ArrayList;

public class FunctionCallStat extends Statement {
    public ArrayList<IVisitorAST> PARAMS;
    public ID ID;
    public boolean USING_RET;

    public FunctionCallStat(int line, ID id, ArrayList<IVisitorAST> params, boolean using_ret) {
        super(line, Statements.FUNCTION);
        PARAMS = params;
        LINE = line;
        this.ID = id;
        USING_RET = using_ret;
    }

    @Override
    public void compile(Builder builder) {
        for (IVisitorAST obj : PARAMS) {
            obj.compile(builder);
        }
        builder.emit(new CallInsn(this.ID.NAME, PARAMS, USING_RET));
    }
}
