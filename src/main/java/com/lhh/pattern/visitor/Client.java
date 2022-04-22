package com.lhh.pattern.visitor;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 21:14
 */
public class Client {

    public static void main(String[] args) {
        // 创建home对象
        Home home = new Home();
        // 添加元素到home对象中
        home.add(new Dog());
        home.add(new Cat());

        // 创建主人对象
        Owner owner = new Owner();
        home.action(owner);
    }
}
