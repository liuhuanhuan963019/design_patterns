package com.lhh.pattern.singleton.demo05;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 15:38
 * @Description
 */
public class Singleton {

    private Singleton() {

    }

    // 因为是静态内部类。当我们在getInstance中调用这个内部类的时候，它会初始化instance 但是是在静态内部类进行实现的，所以只会实现一次
    // 那么多个线程调用这个方法的时候，就是同样的调用者一个方法
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
