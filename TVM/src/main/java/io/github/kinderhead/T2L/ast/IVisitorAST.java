package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;

/**
 * Main AST interface.
 */
public interface IVisitorAST {
    /**
     * Get the line number.
     *
     * @return The line
     */
    int getLine();

    /**
     * Get the type of the object.
     *
     * @deprecated Never used
     * @return The type
     */
    @Deprecated Statements getType();

    /**
     * Compile the object.
     *
     * @param builder The builder
     * @see Builder
     */
    void compile(Builder builder);
}
