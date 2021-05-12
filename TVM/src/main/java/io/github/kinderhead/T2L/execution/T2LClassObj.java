package io.github.kinderhead.T2L.execution;

public class T2LClassObj extends T2LObject {
    public int ORIGIN_ENV;
    public String ORIGIN_NAME;

    public T2LClassObj() {
        TYPE = T2LTypes.CUSTOM;
    }

    @Override
    public T2LObject clone() {
        T2LClassObj obj = (T2LClassObj) super.clone();
        obj.ORIGIN_ENV = ORIGIN_ENV;
        obj.ORIGIN_NAME = ORIGIN_NAME;
        return obj;
    }
}
