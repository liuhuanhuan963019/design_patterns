package com.lhh.pattern.singleton.demo04;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 15:28
 * @Description
 */
public class Singleton {

    private Singleton() {

    }

    // 申明静态变量 volatile修饰保证我们的指令是有序的  解决了在多线程情况下，可能出现的问题
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
