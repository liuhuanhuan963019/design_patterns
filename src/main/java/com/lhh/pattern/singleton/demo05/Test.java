package com.lhh.pattern.singleton.demo05;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 15:28
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance==instance2);
    }
}
