package com.dayong.demo.pattern.behavior.command;

/**
 * 后退命令实现类
 *
 * @author Dayong Chan
 */
public class MoveBackCommand implements MoveCommand {
    private Car car;

    public MoveBackCommand(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.executeCmd("后退");
    }
}
