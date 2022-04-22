package com.lhh.pattern.mediator;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 20:21
 */
public class HouseOwner extends Person{

    public HouseOwner(String name, Mediator meditor) {
        super(name, meditor);
    }

    public void constact(String message){
        meditor.constact(message,this);
    }
    public void getMessage(String message) {
        System.out.println("房主:"+name+"获取的消息是"+message);
    }
}
