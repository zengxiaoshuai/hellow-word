package com.test.adapter;

/**
 * 适配器模式
 */
public class Test {

    public static void main(String[] args) {

        //DC5V dc5V = new Adapter();
        DC5V dc5V = new Adapter1();
        dc5V.outPut();


    }

}
