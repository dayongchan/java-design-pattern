package com.dayong.demo.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject 对象带有绑定观察者到 Client 对象和从 Client 对象解绑观察者的方法
 *
 * @author Dayong Chan
 */
public class Subject {
    /**
     * 保存所有需要观察的对象
     */
    private List<Observer> observers = new ArrayList<>();
    /**
     * 保存当前的状态
     */
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //通知所有的被观察的对象更新状态
        notifyAllObservers();
    }

    /**
     * 添加到被观察的队列里面
     *
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 通知所有的被观察的对象更新状态
     */
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}