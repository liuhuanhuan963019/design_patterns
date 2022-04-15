package com.lhh.pattern.singleton.demo03;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 15:07
 * @Description
 */
public class Singleton {

    //私有构造方法
    private Singleton() {

    }

    // 私有成员变量
    private static Singleton instance;

    //
    public static synchronized Singleton getInstance() {
        // 判断instance是否存在，如果存在直接返回，否则就创建一个对象并返回
        if(instance == null) {
            // 线程1等待，线程2获取到cpu的执行权，也会进入到该判断里面
            instance = new Singleton();
        }
        return instance;
    }
}
