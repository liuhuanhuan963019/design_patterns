package com.lhh.pattern.factory.after.expand_factory;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 20:36
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Coffee america = CofferFactory.createCoffee("america");
        System.out.println(america.getName());
    }
}
