package com.dayong.demo.pattern.behavior.observer;

/**
 * 右后轮避震被观察者
 *
 * @author Dayong Chan
 */
public class RightRearWheelObserver extends Observer {

    public RightRearWheelObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("校准结果: " + subject.getState() + 4);
    }
}