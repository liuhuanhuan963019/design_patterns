package com.lhh.pattern.singleton.demo06;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 15:55
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);


    }
}
