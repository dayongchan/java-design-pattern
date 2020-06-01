package com.dayong.demo.pattern.creator.factory.abstractfactory;

/**
 * CRV的实现类
 *
 * @author Dayong Chan
 */
public class CRV implements Car {
    @Override
    public void make() {
        System.out.println("CRV is making...");
    }
}
