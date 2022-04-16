package com.lhh.pattern.builder.demo03;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/16 19:30
 * @Description
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("ofo车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("ofo座位");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
