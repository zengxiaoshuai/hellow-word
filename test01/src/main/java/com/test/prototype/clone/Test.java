package com.test.prototype.clone;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("peiqi",birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);
        System.out.println("===========================");
        pig1.getBirthday().setTime(6666666666L);
        System.out.println(pig1);
        System.out.println(pig2);
    }
}
