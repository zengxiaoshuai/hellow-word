package com.test.decorator;

public class SausageDecorator extends BatterCakeDecorator {
    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDec() {
        return super.getDec()+"香肠";
    }

    @Override
    protected int getCost() {
        return super.getCost()+2;
    }

}
