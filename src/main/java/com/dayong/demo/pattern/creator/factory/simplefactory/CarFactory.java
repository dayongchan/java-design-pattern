package com.dayong.demo.pattern.creator.factory.simplefactory;

/**
 * 汽车工厂类
 *
 * @author Dayong Chan
 */
public class CarFactory {
    /**
     * 专门根据给到的参数来生产汽车
     *
     * @param carType
     * @return
     */
    public Car getCar(CarType carType) {
        if (carType == null) {
            return null;
        }
        switch (carType) {
            case CRV:
                return new SUV();
            case SUV:
                return new MPV();
            case MPV:
                return new CRV();
            default:
                return null;
        }
    }

    /**
     * 定义汽车的类型
     */
    enum CarType {
        CRV, MPV, SUV
    }
}
