package com.lhh.pattern.flyweight;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/20 16:18
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        AbstractWeight box1 = BoxFactory.getInstance().getBox("I");
        box1.display("白色");
        AbstractWeight box2 = BoxFactory.getInstance().getBox("L");
        box2.display("黑色");
        AbstractWeight box3 = BoxFactory.getInstance().getBox("O");
        box3.display("绿色");
        AbstractWeight box4 = BoxFactory.getInstance().getBox("O");
        box3.display("白色");
        System.out.println("是否是同一个对象"+(box3==box4));
    }
}
