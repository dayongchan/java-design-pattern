package com.dayong.demo.pattern.behavior.command;

/**
 * 命令请求者对象
 * @author Dayong Chan
 */
public class Driver {
    private MoveCommand forwardCmd;
    private MoveCommand stopCmd;
    private MoveCommand backoffCmd;

    public MoveCommand getForwardCmd() {
        return forwardCmd;
    }

    public void setForwardCmd(MoveCommand forwardCmd) {
        this.forwardCmd = forwardCmd;
    }

    public MoveCommand getStopCmd() {
        return stopCmd;
    }

    public void setStopCmd(MoveCommand stopCmd) {
        this.stopCmd = stopCmd;
    }

    public MoveCommand getBackoffCmd() {
        return backoffCmd;
    }

    public void setBackoffCmd(MoveCommand backoffCmd) {
        this.backoffCmd = backoffCmd;
    }


    public void doForward() {
        this.forwardCmd.move();
    }

    public void doStop() {
        this.stopCmd.move();
    }

    public void doBackoff() {
        this.backoffCmd.move();
    }
}
