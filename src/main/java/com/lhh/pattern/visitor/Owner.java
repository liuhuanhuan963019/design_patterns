package com.lhh.pattern.visitor;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 21:18
 */
public class Owner implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂狗");
    }
}
