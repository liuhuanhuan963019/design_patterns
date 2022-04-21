package com.lhh.pattern.state.after;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 20:42
 */
public class StoppingState extends LiftState{
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENNINGSTATE);
        super.context.open();
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.STOPPINGSTATE);
        super.context.close();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNINGSTATE);
        super.context.run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }
}
