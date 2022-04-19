package com.lhh.pattern.decorator;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 20:16
 * @Description  炒面类（具体构建角色）
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles() {
        super(12,"炒面");
    }

    @Override
    public float cost() {

        return getPrice();
    }
}
