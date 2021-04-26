package com.test.mytest;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 静态内部类单例
 *
 * 既实现了懒加载，还能实现完美单例
 */
public class Demo03 {

    private Demo03(){}

    private static class Demo03Holder{
        private static final Demo03 INSTANCE = new Demo03();
    }

    public static Demo03 getInstance(){
        return Demo03Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            new Thread(()->{
                System.out.println(Demo03.getInstance().hashCode());
            }).start();

        }
    }
}
