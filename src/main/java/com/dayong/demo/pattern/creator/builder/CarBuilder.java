package com.dayong.demo.pattern.creator.builder;

/**
 * 这里的两种车相差有点大，但是思路是没问题的
 *
 * @author Dayong Chan
 */
public class CarBuilder {
    /**
     * 准备好制造汽车相关的业务内容
     *
     * @return
     */
    public Car prepareAutomobile() {
        Car car = new Car("小汽车");
        //Component这里抽象的比较大，还可以继续进行更深层次的提炼和抽象
        car.addComponent(new V4Engine());
        car.addComponent(new HatchBackBody());
        return car;
    }

    /**
     * 准备好制造列车相关的业务内容
     *
     * @return
     */
    public Car prepareTrain() {
        Car car = new Car("列车");
        car.addComponent(new CRH6Engine());
        car.addComponent(new EnClosedBody());
        return car;
    }
}
