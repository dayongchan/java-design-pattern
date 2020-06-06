package com.dayong.demo.pattern.behavior.strategy.type;

/**
 * 经济模式
 *
 * @author Dayong Chan
 */
public class EcoStrategy extends WorkStrategy {

    public EcoStrategy() {
        this.defaultGearSpeed = 10f;
        this.acceleration = 0.8f;
    }

}
