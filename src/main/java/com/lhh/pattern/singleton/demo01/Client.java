package com.lhh.pattern.singleton.demo01;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 14:43
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Singletom s1 = Singletom.getInstance();
        Singletom s2 = Singletom.getInstance();
        System.out.println(s1==s2);
    }
}
