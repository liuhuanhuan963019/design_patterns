package com.lhh.pattern.decorator;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 20:14
 * @Description 快餐类  （抽象构建角色）
 */
public abstract class FastFood {

    private float price;

    private String desc;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }

    public  abstract float cost();
}
