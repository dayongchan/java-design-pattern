package com.dayong.demo.pattern.behavior.memento;

/**
 * 备忘录模式示例程序
 * 此模式一般适用于需要执行回滚操作的处理
 * @author Dayong Chan
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.setState("start");
        car.setState("move");
        Memento saveState = car.saveState();
        car.setState("stop");
        car.restoreState(saveState);
        System.out.println("last state is:" + car.getState());
    }
}
