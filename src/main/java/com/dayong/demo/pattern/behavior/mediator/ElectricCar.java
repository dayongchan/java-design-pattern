package com.dayong.demo.pattern.behavior.mediator;

/**
 * 电动车
 * @author Dayong Chan
 */
public class ElectricCar implements  Car {
    @Override
    public void onSell() {
        System.out.println("sold one electric car");
    }
}
