package com.dayong.demo.pattern.creator.singleton;

/**
 * 饿汉式
 *
 * @author Dayong Chan
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return instance;
    }

    public void sayHello(){
        System.out.println("Hey, Guy!");
    }
}
