package com.dayong.demo.pattern.behavior.strategy.type;

/**
 * 运动模式
 *
 * @author Dayong Chan
 */
public class SportStrategy extends WorkStrategy {

    public SportStrategy() {
        this.defaultGearSpeed = 20f;
        this.acceleration = 1.2f;
    }
}
