package com.dayong.demo.pattern.behavior.observer;

/**
 * 观察者抽象对象
 * @author Dayong Chan
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}