package com.lhh.pattern.decorator;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 20:23
 * @Description 鸡蛋类（具体的装饰角色）
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(1,"鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        //计算价格
        return getFastFood().getPrice() + getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+getFastFood().getDesc();
    }
}
