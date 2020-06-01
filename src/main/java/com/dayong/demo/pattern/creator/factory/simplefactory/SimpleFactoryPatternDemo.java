package com.dayong.demo.pattern.creator.factory.simplefactory;

/**
 * 简单工厂模式示例程序
 *
 * @author Dayong Chan
 */
public class SimpleFactoryPatternDemo {
    public static void main(String[] args) {
        //先实例化一个汽车工厂
        CarFactory factory = new CarFactory();

        //获取 CRV 的对象，并调用它的 drive 方法
        Car crv = factory.getCar(CarFactory.CarType.CRV);
        crv.drive();

        //获取 MPV 的对象，并调用它的 drive 方法
        Car mpv = factory.getCar(CarFactory.CarType.MPV);
        mpv.drive();

        //获取 SUV 的对象，并调用它的 drive 方法
        Car suv = factory.getCar(CarFactory.CarType.SUV);
        suv.drive();
    }
}
