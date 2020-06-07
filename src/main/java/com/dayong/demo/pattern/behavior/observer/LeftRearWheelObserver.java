package com.dayong.demo.pattern.behavior.observer;


/**
 * 左后轮避震被观察者
 *
 * @author Dayong Chan
 */
public class LeftRearWheelObserver extends Observer{

    public LeftRearWheelObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("校准结果: " + subject.getState() + 2);
    }
}