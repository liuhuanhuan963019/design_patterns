package com.lhh.pattern.responibility;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 19:09
 */
public class GroupLeader extends Handler{

    public GroupLeader() {
        super(0, NUM_ONE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天" + leave.getContent());
        System.out.println("小组长审批：同意");
    }
}
