package com.test.prototype.abstracprototype;
//可以将原型模式重写的克隆方法放在抽象父类
public abstract class A implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
