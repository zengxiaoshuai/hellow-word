package com.test.singleton;

/**
 * 饿汉式
 */
public class Demo01 {
    private static final Demo01 INSTANCE = new Demo01();

    private Demo01() {

    }
    public static Demo01 getInstance(){
        return INSTANCE;
    }
}
