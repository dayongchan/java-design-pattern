package com.dayong.demo.pattern.creator.factory.abstractfactory;

/**
 * 汽车品牌工厂类
 *
 * @author Dayong Chan
 */
public class BrandFactory extends AbstractFactory {

    @Override
    public Car getCar(CarFactory.CarType carType) {
        //这个工厂不生产不贴牌的汽车，所以这里直接放回空对象
        return null;
    }

    /**
     * 专门根据给到的品牌来生产汽车
     *
     * @param brandType
     * @return
     */
    @Override
    public Brand getBrand(BrandType brandType) {
        if (brandType == null) {
            return null;
        }
        switch (brandType) {
            case BYD:
                return new BYD();
            case Toyota:
                return new Toyota();
            case Honda:
                return new Honda();
            default:
                return null;
        }
    }

    /**
     * 定义汽车的品牌
     */
    enum BrandType {
        BYD, Toyota, Honda
    }
}
