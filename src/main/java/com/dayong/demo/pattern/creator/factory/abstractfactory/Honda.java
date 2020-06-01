package com.dayong.demo.pattern.creator.factory.abstractfactory;

/**
 * 本田的汽车生产线
 *
 * @author Dayong Chan
 */
public class Honda implements Brand {
    @Override
    public void oem() {
        System.out.println("OEM for Honda...");
    }
}
