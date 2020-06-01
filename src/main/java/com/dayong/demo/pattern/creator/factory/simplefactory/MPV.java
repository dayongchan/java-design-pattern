package com.dayong.demo.pattern.creator.factory.simplefactory;

/**
 * MPV的实现类
 *
 * @author Dayong Chan
 */
public class MPV implements Car {
    @Override
    public void drive() {
        System.out.println("MPV is driving...");
    }
}
