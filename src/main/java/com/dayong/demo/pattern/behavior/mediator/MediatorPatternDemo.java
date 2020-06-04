package com.dayong.demo.pattern.behavior.mediator;

/**
 * 中介者模式示例程序
 * @author Dayong Chan
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        Car electricCar = new ElectricCar();
        Car gasolineCar = new GasolineCar();
        Dealer dealer = new FourServiceShop(electricCar, gasolineCar);
        Client client = new Client(dealer);
        client.buyCar("Electric");
        client.buyCar("Gasoline");
    }
}
