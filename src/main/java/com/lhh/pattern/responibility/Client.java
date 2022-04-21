package com.lhh.pattern.responibility;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 19:18
 */
public class Client {

    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("lhh",4,"病假");

        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        //提交请假申请
        groupLeader.submit(leaveRequest);

    }
}
