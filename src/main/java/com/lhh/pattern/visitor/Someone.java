package com.lhh.pattern.visitor;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 21:18
 */
public class Someone implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂狗");
    }
}
