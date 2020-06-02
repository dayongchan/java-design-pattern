package com.dayong.demo.pattern.creator.builder;

/**
 * 建造者模式示例程序
 *
 * @author Dayong Chan
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        //声明并实例化一个建造者
        CarBuilder builder = new CarBuilder();
        //建造小汽车
        Car car = builder.prepareAutomobile();
        //展示小汽车组成的内容
        car.show();

        //建造列车
        car = builder.prepareTrain();
        //展示列车组成的内容
        car.show();
    }
}
