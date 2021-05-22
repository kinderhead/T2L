package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;

/**
 * The statement AST baseclass
 *
 * @see IVisitorAST
 */
public abstract class Statement implements IVisitorAST {
    public int LINE;


    @Deprecated
    private final Statements TYPE;

    /**
     * Get the line number.
     *
     * @return The line
     */
    @Override
    public int getLine() {
        return LINE;
    }

    /**
     * Get the type of the object.
     *
     * @deprecated Never used
     * @return The type
     */
    @Override
    @Deprecated
    public Statements getType() {
        return TYPE;
    }

    /**
     * Compile the object.
     *
     * @param builder The builder
     * @see Builder
     */
    @Override
    public abstract void compile(Builder builder);

    /**
     * Creates the statement.
     *
     * @param line The line
     * @param type The type
     */
    public Statement(int line, @Deprecated Statements type) {
        LINE = line;
        TYPE = type;
    }
}
