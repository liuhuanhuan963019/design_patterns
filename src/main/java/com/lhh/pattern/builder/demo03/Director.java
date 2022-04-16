package com.lhh.pattern.builder.demo03;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/16 19:31
 * @Description
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
