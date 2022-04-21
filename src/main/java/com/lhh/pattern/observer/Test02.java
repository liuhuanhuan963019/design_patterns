package com.lhh.pattern.observer;

import javafx.scene.SubScene;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 21:21
 */
public class Test02 implements oberver{
    private Subject subject;

    private String name;

    public Test02(Subject subject, String name) {
        this.subject = subject;
        this.name = name;
        this.subject.addObserver(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void updateMsg(String msg) {
        System.out.println(name + msg);
    }
}
