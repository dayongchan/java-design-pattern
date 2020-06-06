package com.dayong.demo.pattern.behavior.strategy;

import com.dayong.demo.pattern.behavior.strategy.type.EcoStrategy;
import com.dayong.demo.pattern.behavior.strategy.type.SportStrategy;

/**
 * 策略模式示例程序
 *
 * @author Dayong Chan
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Car car = new Car();
        //修改策略
        car.setStrategy(new EcoStrategy());
        //设置档位
        car.setGear(1);
        //获取当前速度
        car.getSpeed();
        //更换策略
        car.setStrategy(new SportStrategy());
        //获取当前速度
        car.getSpeed();
        //设置档位
        car.setGear(6);
        //获取当前速度
        car.getSpeed();
    }
}
