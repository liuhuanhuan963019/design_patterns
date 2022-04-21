package com.lhh.pattern.command;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 18:43
 */
public class Client {
    public static void main(String[] args) {
        // 创建订单对象
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("炸鸡",1);
        order1.setFood("薯片",1);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("可乐",1);
        order2.setFood("鸡锁骨",1);

        SeniorChef seniorChef = new SeniorChef();

        // 创建命令创造者
        OrderCommand cmd1 = new OrderCommand(seniorChef,order1);
        OrderCommand cmd2 = new OrderCommand(seniorChef,order2);

        //创建调用者
        Waiter waiter = new Waiter();
        waiter.setCommand(cmd1);
        waiter.setCommand(cmd2);
        waiter.orderUp();
    }
}
