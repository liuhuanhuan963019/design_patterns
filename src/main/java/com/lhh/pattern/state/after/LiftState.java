package com.lhh.pattern.state.after;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 20:40
 */
public abstract class LiftState {

    //声明 环境决定类
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //电梯开启操作
    public abstract void open();
    //电梯关闭操作
    public abstract void close();
    //电梯运行操作
    public abstract void run();
    //电梯关闭操作
    public abstract void stop();
}
