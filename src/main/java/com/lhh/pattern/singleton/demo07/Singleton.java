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

    // 解决单例被破坏的问题
    // 当进行反序列化时，会自动调用该方法，将该方法的返回值直接返回
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
