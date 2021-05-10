package com.test.prototype.abstracprototype;

public class B extends A {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        System.out.println(b);
        System.out.println(b.clone());
    }
}
