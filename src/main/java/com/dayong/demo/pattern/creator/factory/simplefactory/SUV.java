package com.dayong.demo.pattern.creator.factory.simplefactory;

/**
 * SUV的实现类
 *
 * @author Dayong Chan
 */
public class SUV implements Car {
    @Override
    public void drive() {
        System.out.println("SUV is driving...");
    }
}
