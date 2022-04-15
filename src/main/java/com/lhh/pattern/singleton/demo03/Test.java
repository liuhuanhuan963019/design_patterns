package com.lhh.pattern.singleton.demo03;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 15:07
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);

    }
}
