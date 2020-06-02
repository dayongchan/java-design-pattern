package com.dayong.demo.pattern.creator.builder;

/**
 * 舱背式车身
 *
 * @author Dayong Chan
 */
public class HatchBackBody implements Component {
    @Override
    public String name() {
        return "舱背式车身";
    }

    @Override
    public float price() {
        return 10000f;
    }
}
