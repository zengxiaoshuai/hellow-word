package com.test.mytest;

/**
 * 枚举单例
 *      大牛最完美单例
 */
public enum  Demo04 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Demo04.INSTANCE.hashCode());
                }
            }).start();
        }
    }
}
