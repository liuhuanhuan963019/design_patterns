package com.lhh.pattern.proxy.jdk_proxy;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 14:00
 * @Description
 */
public class TrainStation implements SellTicket {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
