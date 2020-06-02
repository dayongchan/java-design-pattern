package com.dayong.demo.pattern.creator.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义好车的对象，并且定义好组成车的零件的列表
 *
 * @author Dayong Chan
 */
public class Car {
    private String name;
    private List<Component> componentList = new ArrayList<>();

    /**
     * 默认构造函数，制定车的名称或者类型
     *
     * @param name
     */
    public Car(String name) {
        this.name = name;
    }

    /**
     * 提供添加部件的方法
     *
     * @param component
     */
    public void addComponent(Component component) {
        componentList.add(component);
    }

    /**
     * 完成信息的展示，可以当成业务操作的处理方法
     */
    public void show() {
        float total = 0f;
        System.out.println("Car name is:" + name);
        System.out.println("Component list:");
        for (Component component : componentList) {
            System.out.println("name:" + component.name() + ", price:" + component.price());
            total += component.price();
        }
        System.out.println("Total price:" + total);
    }
}
