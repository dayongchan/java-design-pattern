package com.dayong.demo.pattern.behavior.command;

/**
 * 命令接受者对象
 * @author Dayong Chan
 */
public class Car {
     public void executeCmd(String cmd){
         System.out.println("汽车开始执行：" + cmd + "操作");
     }
}
