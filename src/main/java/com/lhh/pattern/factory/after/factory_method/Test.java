package com.lhh.pattern.factory.after.factory_method;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 19:38
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
//        CoffeeFactory coffeeFactory = new AmericaFactory();
        CoffeeFactory coffeeFactory = new NatieFactory();
        coffeeStore.setCoffeeFactory(coffeeFactory);
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
