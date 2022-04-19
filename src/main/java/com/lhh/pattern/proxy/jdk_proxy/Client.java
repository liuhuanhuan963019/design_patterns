package com.lhh.pattern.proxy.jdk_proxy;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 14:29
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        //1.创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        // 2.使用factory对象的方法获取代理对象
        SellTicket sellTicket = factory.getProxyObject();
        // 3.调用卖票的实例方法
        sellTicket.sell();
    }
}
