package com.lhh.pattern.singleton.demo01;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 14:40
 * @Description 饿汉式单例模式（静态成员变量的方式）
 */
public class Singletom {

    // 私有构造方法
    private Singletom() {
    }

    // 在本类总创建奔雷对象
    private static Singletom instance = new Singletom();

    // 提供一个公共的外界访问方式，让外界获取该对象
    public static Singletom getInstance() {
        return instance;
    }
}
