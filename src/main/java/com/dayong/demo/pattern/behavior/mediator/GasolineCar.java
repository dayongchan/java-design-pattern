package com.dayong.demo.pattern.behavior.mediator;

/**
 * 燃油车
 * @author Dayong Chan
 */
public class GasolineCar implements  Car {
    @Override
    public void onSell() {
        System.out.println("sold one gasoline car");
    }
}
