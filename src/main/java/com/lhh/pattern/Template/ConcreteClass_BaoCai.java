package com.lhh.pattern.Template;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/20 17:12
 * @Description
 */
public class ConcreteClass_BaoCai extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
