package io.github.kinderhead.T2L.execution;

/**
 * The default way to create a builtin module.
 * Gets wrapped around a {@link JavaInterface}.
 *
 * @see Environment#registerModule(T2LModule)
 */
public abstract class T2LModule {
    /**
     * Get the importable name of the module.
     *
     * @return The name
     */
    public abstract String getName();
}
