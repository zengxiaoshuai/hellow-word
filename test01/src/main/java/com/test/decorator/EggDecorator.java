package com.test.decorator;

public class EggDecorator extends BatterCakeDecorator {

    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDec() {
        return super.getDec()+"加蛋";
    }

    @Override
    protected int getCost() {
        return super.getCost()+1;
    }
}
