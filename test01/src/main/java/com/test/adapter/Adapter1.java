package com.test.adapter;

public class Adapter1 extends AC220 implements DC5V {
    @Override
    public int outPut() {
        int input = super.outPut220();

        //逻辑处理
        int outPut = input/44;

        System.out.println("输入: " + input + " v 输出: " + outPut + " v" );

        return outPut;
    }
}
