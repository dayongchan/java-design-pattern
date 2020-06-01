package com.dayong.demo.pattern.creator.factory.abstractfactory;

/**
 * SUV生产线的实现类
 *
 * @author Dayong Chan
 */
public class SUV implements Car {
    @Override
    public void make() {
        System.out.println("SUV is making...");
    }
}
