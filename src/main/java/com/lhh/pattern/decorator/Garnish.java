package com.lhh.pattern.decorator;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 20:20
 * @Description
 */
public abstract class Garnish extends FastFood{
   // 申明快餐类的变量
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

}
