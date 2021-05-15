package com.test.decorator;

/**
 *
 * 装饰者模式：
 *
 */

public class Test {

    public static void main(String[] args) {
        ABatterCake aBatterCake = new BatterCake();

        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);

        aBatterCake= new SausageDecorator(aBatterCake);

        System.out.println(aBatterCake.getDec()+"花费"+aBatterCake.getCost()+"元");
    }

}
