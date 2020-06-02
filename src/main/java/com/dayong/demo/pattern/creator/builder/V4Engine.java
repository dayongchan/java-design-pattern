package com.dayong.demo.pattern.creator.builder;

/**
 * 普通的4缸汽油发动机
 *
 * @author Dayong Chan
 */
public class V4Engine implements Component {
    @Override
    public String name() {
        return "V4Engine";
    }

    @Override
    public float price() {
        return 5000f;
    }
}
