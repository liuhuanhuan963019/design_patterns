package com.lhh.pattern.singleton.demo07;

import java.io.Serializable;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 16:00
 * @Description
 */
public class Singleton implements Serializable {

    private Singleton() {

    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
