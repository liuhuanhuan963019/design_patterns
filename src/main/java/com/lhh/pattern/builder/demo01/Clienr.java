package com.lhh.pattern.builder.demo01;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 22:30
 * @Description
 */
public class Clienr {

    public static void main(String[] args) {
        Director director = new Director(new MobileBuilder());
        Bike constructor = director.constructor();
        System.out.println(constructor.getFrame());
        System.out.println(constructor.getSeat());
    }
}
