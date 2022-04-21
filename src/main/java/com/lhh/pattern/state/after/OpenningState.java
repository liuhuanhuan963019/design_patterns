package com.lhh.pattern.state.after;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 20:42
 */
public class OpenningState extends LiftState{
    // 当前状态要执行的方法
    @Override
    public void open() {
        System.out.println("电梯开启。。。");
    }

    @Override
    public void close() {
        // 修改状态
        super.context.setLiftState(Context.CLOSINGSTATE);
        super.context.close();
    }

    @Override
    public void run() {
        // 什么都不做
    }

    @Override
    public void stop() {
        // 什么都不做
    }
}
