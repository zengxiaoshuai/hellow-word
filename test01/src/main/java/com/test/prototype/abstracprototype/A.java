package com.test.prototype.abstracprototype;

public abstract class A implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
