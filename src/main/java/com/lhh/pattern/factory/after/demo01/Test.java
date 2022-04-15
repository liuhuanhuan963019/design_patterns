package com.lhh.pattern.factory.after.demo01;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 19:09
 * @Description
 */
public class Test {
    public static void main(String[] args) throws Exception {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee america = coffeeStore.orderCoffee("america");
        System.out.println(america.getName());
    }
}
