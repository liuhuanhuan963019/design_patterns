package com.lhh.principles.demo2.after;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 16:50
 * @Description
 */
public class Square implements Quadrilateral{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getWidth() {
        return side;
    }

    @Override
    public double getLength() {
        return side;
    }

}
