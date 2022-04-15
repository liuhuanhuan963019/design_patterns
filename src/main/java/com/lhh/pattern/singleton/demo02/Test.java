package com.lhh.pattern.singleton.demo02;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 15:03
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.printf(String.valueOf(singleton1 == singleton2));
    }
}
