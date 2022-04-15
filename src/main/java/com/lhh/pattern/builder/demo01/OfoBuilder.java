package com.lhh.pattern.builder.demo01;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 22:25
 * @Description
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        mBike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
