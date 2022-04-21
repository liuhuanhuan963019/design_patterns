package com.lhh.pattern.state.after;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 20:42
 */
public class RunningState extends LiftState{
    @Override
    public void open() {
        // 什么都不做
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯正在运行。。。");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPINGSTATE);
        super.context.stop();
    }
}
