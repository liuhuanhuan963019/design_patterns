package com.lhh.principles.demo2.before;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 16:30
 * @Description
 */
public class Square extends Rectangle{

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
