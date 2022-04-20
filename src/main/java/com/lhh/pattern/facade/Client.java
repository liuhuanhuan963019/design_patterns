package com.lhh.pattern.facade;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/20 15:23
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        SmartApplianceFacade smartApplianceFacade = new SmartApplianceFacade();
        smartApplianceFacade.say("打开");

        System.out.println("=======================");
        smartApplianceFacade.say("关闭");

    }
}
