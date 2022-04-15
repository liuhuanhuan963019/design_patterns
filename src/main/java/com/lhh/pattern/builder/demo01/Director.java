package com.lhh.pattern.builder.demo01;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 22:26
 * @Description
 */
public class Director {

    // 申明Builder变量
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装自行车的方法
    public Bike constructor() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
