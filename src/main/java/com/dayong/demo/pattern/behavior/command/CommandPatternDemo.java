package com.dayong.demo.pattern.behavior.command;

/**
 * 命令模式示例程序
 * @author Dayong Chan
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Car car = new Car();

         MoveCommand forward = new MoveForwardCommand(car);
         MoveCommand stop = new StopMoveCommand(car);
         MoveCommand backoff = new MoveBackCommand(car);

         Driver driver = new Driver();
         driver.setForwardCmd(forward);
         driver.setStopCmd(stop);
         driver.setBackoffCmd(backoff);

         driver.doForward();
         driver.doBackoff();
         driver.doStop();
    }
}
