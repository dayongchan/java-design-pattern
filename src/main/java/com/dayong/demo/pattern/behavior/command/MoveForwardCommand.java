package com.dayong.demo.pattern.behavior.command;

/**
 * 前进命令实现类
 * @author Dayong Chan
 */
public class MoveForwardCommand implements MoveCommand {
    private Car car;

    public MoveForwardCommand(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.executeCmd("前进");
    }
}
