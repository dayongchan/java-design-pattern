package com.dayong.demo.pattern.creator.factory.abstractfactory;

/**
 * 比亚迪的汽车生产线
 *
 * @author Dayong Chan
 */
public class BYD implements Brand {
    @Override
    public void oem() {
        System.out.println("OEM for BYD...");
    }
}
