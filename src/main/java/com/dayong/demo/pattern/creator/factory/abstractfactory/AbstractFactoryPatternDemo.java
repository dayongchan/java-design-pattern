package com.dayong.demo.pattern.creator.factory.abstractfactory;

/**
 * 抽象工厂模式示例程序
 * 抽象工厂模式主要是为了解决系统的产品或者接口有多种类型的多个实现，但系统一般只消费其中某一种的时候设计出来的模式。
 * 比如下面就介绍一个工厂可以同时生产多种类型的汽车和给多个品牌进行OEM的这种情况的使用
 *
 * @author Dayong Chan
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //先实例化一个汽车工厂
        AbstractFactory carFactory = FactoryProducer.getFactory(FactoryProducer.Type.Car);

        //获取 CRV 的生产线，并调用它的 make 方法
        Car crv = carFactory.getCar(CarFactory.CarType.CRV);
        crv.make();

        //获取 MPV 的生产线，并调用它的 make 方法
        Car mpv = carFactory.getCar(CarFactory.CarType.MPV);
        mpv.make();

        //获取 SUV 的生产线，并调用它的 make 方法
        Car suv = carFactory.getCar(CarFactory.CarType.SUV);
        suv.make();


        //先实例化一个品牌工厂
        AbstractFactory brandFactory = FactoryProducer.getFactory(FactoryProducer.Type.Brand);
        //获取 BYD 的品牌生产线，并调用它的 oem 方法
        Brand byd = brandFactory.getBrand(BrandFactory.BrandType.BYD);
        byd.oem();

        //获取 Toyota 的品牌生产线，并调用它的 oem 方法
        Brand toyota = brandFactory.getBrand(BrandFactory.BrandType.Toyota);
        toyota.oem();

        //获取 Honda 的品牌生产线，并调用它的 oem 方法
        Brand honda = brandFactory.getBrand(BrandFactory.BrandType.Honda);
        honda.oem();
    }
}
