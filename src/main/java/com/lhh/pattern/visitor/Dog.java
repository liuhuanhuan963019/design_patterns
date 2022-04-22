package com.lhh.pattern.visitor;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 21:16
 */
public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("狗说好好吃");
    }
}
