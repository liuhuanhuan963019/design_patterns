package com.lhh.pattern.command;

import java.util.Map;
import java.util.Set;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 18:19
 */
public class OrderCommand implements Command{

    private SeniorChef receiver;

    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "号桌的订单：");
        Map<String, Integer> foodDic = order.getFoodDic();
        // 遍历map集合
        Set<String> strings = foodDic.keySet();
        for (String string:strings) {
            receiver.makeFood(string, foodDic.get(string));
        }
        System.out.println(order.getDiningTable()+"桌的饭菜制作完毕");
    }
}
