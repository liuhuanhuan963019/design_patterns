package com.lhh.pattern.mediator;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 20:16
 * 抽象同事类
 */
public abstract class Person {

    protected String name;

    protected Mediator meditor;

    public Person(String name, Mediator meditor) {
        this.name = name;
        this.meditor = meditor;
    }
}
