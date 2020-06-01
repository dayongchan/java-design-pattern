package com.dayong.demo.pattern.creator.factory.simplefactory;

/**
 * CRV的实现类
 *
 * @author Dayong Chan
 */
public class CRV implements Car {
    @Override
    public void drive() {
        System.out.println("CRV is driving...");
    }
}
