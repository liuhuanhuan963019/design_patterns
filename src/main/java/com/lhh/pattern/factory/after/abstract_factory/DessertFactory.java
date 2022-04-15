package com.lhh.pattern.factory.after.abstract_factory;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 20:00
 * @Description
 */
public abstract class DessertFactory {

    public abstract Coffee createCoffee();
    public abstract Dessert createDessert();
}
