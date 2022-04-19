package com.lhh.pattern.proxy.static_proxy;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 14:01
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        ProxtPoint proxtPoint = new ProxtPoint();
        proxtPoint.sell();
    }
}
