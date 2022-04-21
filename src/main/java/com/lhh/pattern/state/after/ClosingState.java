package com.lhh.pattern.state.after;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 20:42
 */
public class ClosingState extends LiftState{
    @Override
    public void open() {
           super.context.setLiftState(Context.OPENNINGSTATE);
           super.context.open();
    }

    @Override
    public void close() {
            // 什么都不做
    }

    @Override
    public void run() {
            super.context.setLiftState(Context.RUNNINGSTATE);
            super.context.run();
    }

    @Override
    public void stop() {
            super.context.setLiftState(Context.STOPPINGSTATE);
            super.context.stop();
    }
}
