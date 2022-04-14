package com.lhh.principles.demo2.after;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 17:03
 * @Description
 */
public class Rectangle implements Quadrilateral{

    private double length;

    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getLength() {
        return length;
    }
}
