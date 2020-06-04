package com.dayong.demo.pattern.behavior.mediator;

/**
 * 想要买车的客户
 * @author Dayong Chan
 */
public class Client {
    /**
     * 汽车销售商，中介者
     */
    private Dealer dealer;

    public Client(Dealer dealer) {
        this.dealer = dealer;
    }

    public void buyCar(String carType) {
        dealer.sellCar(carType);
    }
}
