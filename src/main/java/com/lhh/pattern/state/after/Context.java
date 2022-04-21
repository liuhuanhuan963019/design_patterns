package com.lhh.pattern.state.after;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 20:40
 */
public class Context {
    public final static OpenningState OPENNINGSTATE = new OpenningState();
    public final static ClosingState CLOSINGSTATE = new ClosingState();
    public final static RunningState RUNNINGSTATE = new RunningState();
    public final static StoppingState STOPPINGSTATE = new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    // 设置当前对象
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //设置当前对象中的context对象
        this.liftState.setContext(this);
    }

    public void run() {
        this.liftState.run();
    }

    public void close() {
        this.liftState.close();
    }

    public void open() {
        this.liftState.open();
    }

    public void stop() {
        this.liftState.stop();
    }

}
