package com.lhh.pattern.flyweight;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/20 16:13
 * @Description
 */
public abstract class AbstractWeight {

    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状：" + this.getShape() + " 颜色：" + color);
    }
}
