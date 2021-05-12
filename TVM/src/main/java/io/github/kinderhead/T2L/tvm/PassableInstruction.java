package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.T2LObject;

public interface PassableInstruction {
    T2LObject getValue(Executor executor);
}
