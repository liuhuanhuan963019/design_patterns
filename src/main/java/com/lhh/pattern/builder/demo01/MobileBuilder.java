package com.lhh.pattern.builder.demo01;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 22:25
 * @Description
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        mBike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("真皮座位");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
