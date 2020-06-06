package com.dayong.demo.pattern.behavior.strategy;

import com.dayong.demo.pattern.behavior.strategy.type.WorkStrategy;

/**
 * 汽车对象
 *
 * @author Dayong Chan
 */
public class Car {
    /**
     * 汽车运作的模式（大部分轿车都会有爬坡模式|经济模式、普通模式、运动模式这三种）
     */
    WorkStrategy strategy;
    /**
     * 汽车的档位
     */
    private int gear;

    /**
     * 设置当前运作的模式
     *
     * @param strategy
     */
    public void setStrategy(WorkStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 设置使用的档位，范围是0-6挡
     *
     * @param gear
     */
    public void setGear(int gear) {
        this.gear = gear;
    }

    /**
     * 获取当前的速度，这个速度会根据不同的模式和档位来确定
     */
    public void getSpeed() {
        float speed = strategy.getDefaultGearSpeed() * strategy.getAcceleration() * gear;
        System.out.println("Current speed is:" + speed + "km/h");
    }
}
