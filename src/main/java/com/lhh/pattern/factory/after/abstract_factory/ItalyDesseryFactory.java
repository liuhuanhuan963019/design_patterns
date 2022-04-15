package com.lhh.pattern.factory.after.abstract_factory;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 20:05
 * @Description
 */
public class ItalyDesseryFactory extends DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new NatieCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Triamisu();
    }
}
