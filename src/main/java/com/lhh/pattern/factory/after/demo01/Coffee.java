package com.lhh.pattern.factory.after.demo01;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 16:50
 * @Description 咖啡类
 */
public abstract class Coffee {
    public abstract String getName();

    public void addSugger() {
        System.out.println("加糖");
    }
    public void addMilk() {
        System.out.println("加奶");

    }
}
