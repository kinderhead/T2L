package io.github.kinderhead.T2L.ast;

import io.github.kinderhead.T2L.tvm.Builder;

public interface IVisitorAST {
    int getLine();
    Statements getType();
    void compile(Builder builder); // Replace builder with tvm builder later
}
