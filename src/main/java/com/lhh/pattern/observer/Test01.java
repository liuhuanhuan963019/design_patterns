package com.lhh.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 21:19
 */
public class Test01 implements Subject{

    private List<oberver> list = new ArrayList<oberver>();

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObserver();
    }

    @Override
    public void addObserver(oberver observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(oberver observer) {
        if (list.indexOf(observer) >= 0) {
            list.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (oberver oberver : list) {
            oberver.updateMsg(msg);
        }
    }
}
