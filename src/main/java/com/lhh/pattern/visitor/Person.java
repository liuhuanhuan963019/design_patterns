package com.lhh.pattern.visitor;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 21:16
 */
public interface Person {

    // 喂食宠物猫
    public void feed(Cat cat);

    // 喂食宠物狗
    public void feed(Dog dog);
}
