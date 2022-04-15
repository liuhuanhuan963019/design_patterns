package com.lhh.pattern.builder.demo01;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 22:22
 * @Description
 */
public abstract class Builder{

    protected Bike mBike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    // 构建自行车
    public abstract Bike createBike();

}
