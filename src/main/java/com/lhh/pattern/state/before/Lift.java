package com.lhh.pattern.state.before;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 19:30
 * 电梯类
 */
public class Lift implements ILift{

    //申明一个记录当前状态的
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state) {  //当前电梯状态
            case OPENING_STATE:
                // 什么都不做
                break;
            case CLOSING_STATE:
                System.out.println("电梯打开了。。。。");
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                //什么都不做
                System.out.println("电梯打开了。。。。");
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                break;
        }
    }

    @Override
    public void close() {
        switch (state) {  //当前电梯状态
            case OPENING_STATE:
                System.out.println("电梯关闭了。。。");  //只有开门状态可以关门
                setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                //不做任何操作
                break;
            case RUNNING_STATE:
                //什么都不做
                //运行时候电梯是关门，所以不能进行关门的操作
                break;
            case STOPPING_STATE:
                //什么都不做
                //停止时候电梯是关门，所以不能进行关门的操作
                break;
        }
    }

    @Override
    public void run() {
        switch (state) {  //当前电梯状态
            case OPENING_STATE:
                // 不执行任何操作
                // 电梯打开的时候，不能执行运行的操作
                break;
            case CLOSING_STATE:
                System.out.println("电梯运行了。。。。");
                setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                //什么都不做
                break;
            case STOPPING_STATE:
                System.out.println("电梯运行了。。。。");
                setState(RUNNING_STATE);
                break;
        }
    }

    @Override
    public void stop() {
        switch (state) {  //当前电梯状态
            case OPENING_STATE: // 开门的电梯已经是停止状态的
                //不执行任何操作
                break;
            case CLOSING_STATE:  // 关门可以停止
                System.out.println("电梯停止。。。");  //只有开门状态可以关门
                setState(STOPPING_STATE);
                break;
            case RUNNING_STATE: //运行时可以停止
                System.out.println("电梯停止。。。");  //只有开门状态可以关门
                setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                //什么都不做
                //停止时候电梯是关门，所以不能进行关门的操作
                break;
        }
    }
}
