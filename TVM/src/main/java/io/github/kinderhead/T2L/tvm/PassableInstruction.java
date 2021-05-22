package io.github.kinderhead.T2L.tvm;

import io.github.kinderhead.T2L.execution.Executor;
import io.github.kinderhead.T2L.execution.T2LObject;

/**
 * Allows certain instructions to get the value of this.
 * For an example, go to {@link ValueInsn#getValue(Executor)}.
 */
public interface PassableInstruction {
    /**
     * Gets the value. Generally the {@link Instruction#execute(Executor)} for this instruction is
     * nothing or:
     * <pre>@code{
     * executor.ENVIRONMENT.push(getValue(executor));
     * }</pre>
     * An example of this is {@link ListInsn#execute(Executor)}.
     *
     * @param executor Executor
     * @return The object
     */
    T2LObject getValue(Executor executor);
}
