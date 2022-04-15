package com.lhh.pattern.factory.before;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 17:00
 * @Description
 */
public class Test {
    public static void main(String[] args) throws Exception {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
