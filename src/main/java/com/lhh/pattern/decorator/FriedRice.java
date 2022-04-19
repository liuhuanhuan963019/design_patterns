package com.lhh.pattern.decorator;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 20:16
 * @Description 炒饭类（具体构建角色）
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10,"炒饭");
    }

    @Override
    public float cost() {

        return getPrice();
    }
}
