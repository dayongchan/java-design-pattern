package com.dayong.demo.pattern.behavior.strategy.type;

/**
 * 汽车运行模式抽象类
 *
 * @author Dayong Chan
 */
public abstract class WorkStrategy {
    /**
     * 换挡加速默认为10km/h
     */
    protected float defaultGearSpeed = 10f;
    /**
     * 加速度的值，默认是1
     */
    protected float acceleration = 1f;
    /**
     * 运行的档位
     */
    protected int gear = 0;

    public float getDefaultGearSpeed() {
        return defaultGearSpeed;
    }

    public void setDefaultGearSpeed(float defaultGearSpeed) {
        this.defaultGearSpeed = defaultGearSpeed;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    //这里可以定义一些跟运行相关的抽象方法，然后再根据不同的运行模式来修改对应实现的业务逻辑，比如不同模式的换挡的逻辑和加速度的处理，还有刹车的逻辑等
}
