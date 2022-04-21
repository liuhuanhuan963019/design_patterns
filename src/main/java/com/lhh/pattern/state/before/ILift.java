package com.lhh.pattern.state.before;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 19:28
 */
public interface ILift {
    //定义四个电梯状态的常量
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    void setState(int state);

    void open();

    void close();

    void run();

    void stop();
}
