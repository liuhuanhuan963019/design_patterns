package com.lhh.pattern.builder.demo03;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/16 19:27
 * @Description
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();

    public Bike construct() {
        this.buildFrame();
        this.buildSeat();
        return this.createBike();
    }
}
