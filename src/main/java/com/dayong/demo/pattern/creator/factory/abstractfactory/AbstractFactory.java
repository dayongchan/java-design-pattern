package com.dayong.demo.pattern.creator.factory.abstractfactory;

/**
 * 抽象工厂类
 *
 * @author Dayong Chan
 */
public abstract class AbstractFactory {
    /**
     * 定义了获取汽车生产线的抽象方法
     *
     * @param carType
     * @return
     */
    public abstract Car getCar(CarFactory.CarType carType);

    /**
     * 定义了获取汽车品牌生产线的抽象方法
     *
     * @param brandType
     * @return
     */
    public abstract Brand getBrand(BrandFactory.BrandType brandType);
}
