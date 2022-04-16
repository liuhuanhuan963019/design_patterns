package com.lhh.pattern.builder.demo03;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/16 19:28
 * @Description
 */
public class MobaBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("摩拜车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
