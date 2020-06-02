package com.dayong.demo.pattern.creator.builder;

/**
 * 动车CRH第六代的电动力引擎
 *
 * @author Dayong Chan
 */
public class CRH6Engine implements Component {
    @Override
    public String name() {
        return "CRH6";
    }

    @Override
    public float price() {
        return 1000000f;
    }
}
