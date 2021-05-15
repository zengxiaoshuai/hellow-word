package com.test.adapter;

public class Adapter implements DC5V {
    AC220 ac220 = new AC220();
    @Override
    public int outPut() {
        int out = ac220.outPut220();

        int out5v= out/44;

        System.out.println("输入: " + out + " 输出: " + out5v);

        return out5v;
    }
}
