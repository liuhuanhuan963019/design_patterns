package com.lhh.pattern.proxy.cglib_proxy;



/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 14:29
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = factory.getProxyObject();

        proxyObject.sell();
    }
}
