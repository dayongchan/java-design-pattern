package com.dayong.demo.pattern.creator.singleton;

/**
 * 单例模式示例程序
 *
 * @author Dayong Chan
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //获取单例的对象
        Singleton instance = Singleton.getInstance();

        //显示消息
        instance.sayHello();

        LazySingleton singleton = LazySingleton.getInstance();
        singleton.sayHello();

        singleton = LazySingleton.getInstanceSafe();
        singleton.sayHello();

        singleton = LazySingleton.getInstanceDoubleCheck();
        singleton.sayHello();
    }
}
