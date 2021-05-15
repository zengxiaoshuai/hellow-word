package com.test.decorator;

public class BatterCake extends ABatterCake {
    @Override
    protected String getDec() {
        return "普通煎饼";
    }

    @Override
    protected int getCost() {
        return 8;
    }
}
