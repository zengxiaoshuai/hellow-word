package com.test.singleton;

/**
 * 懒汉式
 */
//多线程访问可能会有线程不安全问题，不是完美单例
public class Demo02 {
    private static  Demo02 INSTANCE;

    private Demo02() {
    }


    //1.会有线程安全问题
   /* public static Demo02 getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Demo02();
        }
        return INSTANCE;
    }*/


    //2.用锁防止线程安全问题，但是效率较低
    /*public static synchronized Demo02 getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Demo02();
        }
        return INSTANCE;
    }*/

    //3.通过减少同步代码块方式，提升效率，但是这个依然不能完美解决线程安全问题，多线程同时
    //走到if判断，也会出现多实例问题，所以升级成4方案--双重检测
   /* public static Demo02 getInstance(){
        if (INSTANCE == null){
            synchronized (Demo02.class){
                INSTANCE = new Demo02();
            }
        }
        return INSTANCE;
    }*/


   //4.双重检测
    public static Demo02 getInstance(){
        if(INSTANCE == null){
            synchronized (Demo02.class){
                if (INSTANCE == null){
                    INSTANCE = new Demo02();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
       /* for (int i = 0;i < 100 ; i ++){

            new Thread(new Runnable() {
                public void run() {
                    System.out.println(Demo02.getInstance().hashCode());
                }
            }).start();

        }*/
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Demo02.getInstance().hashCode());
            }).start();
        }
    }
}
