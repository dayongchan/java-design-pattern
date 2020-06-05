package com.dayong.demo.pattern.behavior.memento;

/**
 * 汽车对象
 * @author Dayong Chan
 */
public class Car {
    /**
     * 汽车的状态
     */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取并保存状态/备忘录
     * @return
     */
    public Memento saveState() {
        return new Memento(state);
    }

    /**
     * 还原之前保存的状态/备忘录
     * @param memento
     */
    public void restoreState(Memento memento) {
        this.state = memento.getState();
    }
}
