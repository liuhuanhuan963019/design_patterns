package com.lhh.pattern.responibility;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 19:16
 */
public class Manager extends Handler{

    public Manager() {
        super(NUM_ONE,NUM_THREE);
    }
    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天" + leave.getContent());
        System.out.println("部门经理审批：同意");
    }
}
