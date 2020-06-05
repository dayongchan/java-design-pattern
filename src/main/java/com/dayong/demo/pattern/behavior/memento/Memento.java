package com.dayong.demo.pattern.behavior.memento;

/**
 * 备忘录对象
 * @author Dayong Chan
 */
public class Memento {
     private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
