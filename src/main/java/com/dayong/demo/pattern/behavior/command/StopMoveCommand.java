package com.dayong.demo.pattern.behavior.command;

/**
 * 停车命令实现类
 * @author Dayong Chan
 */
public class StopMoveCommand implements MoveCommand {
    private Car car;

    public StopMoveCommand(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.executeCmd("停车");
    }
}
