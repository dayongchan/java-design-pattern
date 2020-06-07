package com.dayong.demo.pattern.behavior.observer;

/**
 * 左前轮避震被观察者
 *
 * @author Dayong Chan
 */
public class LeftFrontWheelObserver extends Observer {

    public LeftFrontWheelObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("校准结果: " + subject.getState() + 1);
    }
}