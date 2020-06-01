package com.dayong.demo.pattern.creator.singleton;

/**
 * 懒汉模式的单例
 *
 * @author Dayong Chan
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    /**
     * 非线程安全的，不建议使用
     *
     * @return
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 简单确保线程安全的
     *
     * @return
     */
    public synchronized static LazySingleton getInstanceSafe() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 双检锁/双重校验锁
     *
     * @return
     */
    public static LazySingleton getInstanceDoubleCheck() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public void sayHello(){
        System.out.println("Hey, Guy!");
    }
}
