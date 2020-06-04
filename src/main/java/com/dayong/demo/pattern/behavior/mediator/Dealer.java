package com.dayong.demo.pattern.behavior.mediator;

/**
 * 汽车销售商，中介者抽象类
 * @author Dayong Chan
 */
public abstract class Dealer {
    protected Car electricCar;
    protected Car gasolineCar;

    public Dealer(Car electricCar, Car gasolineCar) {
        this.electricCar = electricCar;
        this.gasolineCar = gasolineCar;
    }

    public abstract void sellCar(String carType);
}
