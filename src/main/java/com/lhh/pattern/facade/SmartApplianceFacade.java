package com.lhh.pattern.facade;

import java.util.List;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 23:06
 * @Description
 */
public class SmartApplianceFacade {

    private AirCondition airCondition;

    private TV tv;

    private Light light;

    public SmartApplianceFacade() {
        airCondition = new AirCondition();
        tv = new TV();
        light = new Light();
    }
     public void say(String msg) {
        if (msg.contains("打开")) {
            on();
        } else if (msg.contains("关闭")) {
            off();
        } else {
            System.out.println("指令发送错误！！！");
        }
     }

     public void on() {
         airCondition.on();
         tv.on();
         light.on();
     }

     public void off() {
        airCondition.off();
        tv.off();
        light.off();
     }

}
