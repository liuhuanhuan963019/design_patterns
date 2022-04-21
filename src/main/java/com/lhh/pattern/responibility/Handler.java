package com.lhh.pattern.responibility;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 19:00
 */
public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

     //该领导处理的请求天数区间
    private int numStart;

    private int numEnd;

    //申明上级领导
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    // 设置上级领导
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
     //各级领导处理请教条的方法
    protected abstract void handlerLeave(LeaveRequest leave);

    //提交请假条
    public final void submit(LeaveRequest leave) {
        // 该领导进行审批
        this.handlerLeave(leave);
        if (this.nextHandler != null && leave.getNum() > this.numEnd) {
            // 提交给上级领导审批
            this.nextHandler.submit(leave);
        } else {
            System.out.println("流程结束");
        }
    }
}
