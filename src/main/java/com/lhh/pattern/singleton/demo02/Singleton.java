package com.lhh.pattern.singleton.demo02;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 14:52
 * @Description 饿汉式  静态代码块
 */
public class Singleton {

    // 私有构造方式
    private Singleton() {
    }

    // 申明singleton类型的变量
    private static Singleton instance;

    //在静态代码块中进行赋值
    static {
        instance = new Singleton();
    }
    //申明外部调用的方法
    public static Singleton getInstance() {
        return instance;
    }
}
