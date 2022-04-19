package com.lhh.pattern.proxy.static_proxy;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 14:00
 * @Description
 */
public class ProxtPoint implements SellTicket{
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理点收取一定的服务费");
        trainStation.sell();
    }
}
