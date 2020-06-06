package com.dayong.demo.pattern.behavior.strategy.type;

/**
 * 普通模式
 *
 * @author Dayong Chan
 */
public class CommonStrategy extends WorkStrategy {
    public CommonStrategy() {
        this.defaultGearSpeed = 15f;
        this.acceleration = 1f;
    }
}
