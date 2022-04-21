package com.lhh.pattern.responibility;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 19:17
 */
public class GeneralManager extends Handler{
    public GeneralManager() {
        super(NUM_THREE,NUM_SEVEN);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天" + leave.getContent());
        System.out.println("总经理审批：同意");
    }
}
