package com.dayong.demo.pattern.creator.factory.abstractfactory;

/**
 * 这里是汽车生产基地
 *
 * @author Dayong Chan
 */
public class FactoryProducer {

    /**
     * 可以根据不同的类型来搭建生产线
     *
     * @param type
     * @return
     */
    public static AbstractFactory getFactory(Type type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case Car:
                return new CarFactory();
            case Brand:
                return new BrandFactory();
            default:
                return null;
        }
    }

    enum Type {
        Car, Brand
    }
}
