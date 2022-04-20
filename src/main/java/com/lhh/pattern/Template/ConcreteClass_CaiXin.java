package com.lhh.pattern.Template;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/20 17:13
 * @Description
 */
public class ConcreteClass_CaiXin extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
