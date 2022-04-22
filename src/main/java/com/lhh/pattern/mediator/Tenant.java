package com.lhh.pattern.mediator;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 20:22
 */
public class Tenant extends Person{


    public Tenant(String name, Mediator meditor) {
        super(name, meditor);
    }

    public void constact(String message){
        meditor.constact(message,this);
    }
    public void getMessage(String message) {
        System.out.println("租房者:"+name+"获取的消息是"+message);
    }
}
