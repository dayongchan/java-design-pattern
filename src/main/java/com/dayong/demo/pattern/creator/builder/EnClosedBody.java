package com.dayong.demo.pattern.creator.builder;

/**
 * 封闭式车厢
 *
 * @author Dayong Chan
 */
public class EnClosedBody implements Component {
    @Override
    public String name() {
        return "封闭式车厢";
    }

    @Override
    public float price() {
        return 1000000f;
    }
}
