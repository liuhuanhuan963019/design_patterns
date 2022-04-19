package com.lhh.pattern.decorator;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 20:23
 * @Description 培根类（具体的装饰角色）
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(2,"培根", fastFood);
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
