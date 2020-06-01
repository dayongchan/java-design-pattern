package com.dayong.demo.pattern.creator.factory.abstractfactory;

/**
 * 丰田的汽车生产线
 *
 * @author Dayong Chan
 */
public class Toyota implements Brand {
    @Override
    public void oem() {
        System.out.println("OEM for Toyota...");
    }
}
