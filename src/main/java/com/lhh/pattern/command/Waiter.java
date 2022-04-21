package com.lhh.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 18:29
 */
public class Waiter  {

    // 持有多个命令多想
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {
        //讲command对象存储到list集合当中来
        commands.add(command);
    }
    //发起命令的方法
    public void orderUp() {
        System.out.println("美女服务员:大厨，来订单啦");
        for (Command command : commands) {
            command.execute();
        }
    }
}
