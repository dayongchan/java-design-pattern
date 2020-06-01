package com.dayong.demo.pattern.creator.factory.abstractfactory;

/**
 * MPV生产线的实现类
 *
 * @author Dayong Chan
 */
public class MPV implements Car {
    @Override
    public void make() {
        System.out.println("MPV is making...");
    }
}
