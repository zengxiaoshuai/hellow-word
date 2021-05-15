package com.test.decorator;

/**
 * 也可以写成抽象类，
 *      在装饰实现里面自定义自己需要的行为
 *          如下面
 *
 */
public  class BatterCakeDecorator extends ABatterCake{
    private ABatterCake aBatterCake;

    public BatterCakeDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    protected String getDec() {
        return this.aBatterCake.getDec();
    }

    @Override
    protected int getCost() {
        return this.aBatterCake.getCost();
    }
}
/*public abstract class BatterCakeDecorator extends ABatterCake{
    private ABatterCake aBatterCake;

    protected abstract void doSomething();
    public BatterCakeDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    protected String getDec() {
        return this.aBatterCake.getDec();
    }

    @Override
    protected int getCost() {
        return this.aBatterCake.getCost();
    }
}*/

