package com.lhh.pattern.factory.after.abstract_factory;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 20:04
 * @Description
 */
public class AmericanDessertFactory extends DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchMousse();
    }
}
