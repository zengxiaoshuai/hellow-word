package com.test.facade;

/**
 * 外观模式
 *      将所有复杂逻辑封装在一起，对外暴露简单调用接口，调用者不用了解里面复杂逻辑
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
