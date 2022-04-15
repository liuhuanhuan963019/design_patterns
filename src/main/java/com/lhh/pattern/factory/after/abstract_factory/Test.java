package com.lhh.pattern.factory.after.abstract_factory;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 20:06
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        ItalyDesseryFactory italyDesseryFactory = new ItalyDesseryFactory();

        Coffee coffee = italyDesseryFactory.createCoffee();
        Dessert dessert = italyDesseryFactory.createDessert();
        dessert.show();
        System.out.println(coffee.getName());
    }
}
