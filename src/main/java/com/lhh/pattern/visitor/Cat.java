package com.lhh.pattern.visitor;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 21:16
 */
public class Cat implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("猫说好好吃");
    }
}
