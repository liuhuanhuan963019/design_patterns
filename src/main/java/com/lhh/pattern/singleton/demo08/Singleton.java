package com.lhh.pattern.singleton.demo08;

import java.io.Serializable;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 16:00
 * @Description
 */
public class Singleton {
    private static boolean flag;

    private Singleton() {
        synchronized (Singleton.class) {
            if (flag) {
                throw new RuntimeException();
            }
        }
        flag = true;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
