package com.lhh.pattern.factory.after.demo01;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 16:57
 * @Description
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) throws Exception {
        SimpleCoffeeFactory coffee = new SimpleCoffeeFactory();
        Coffee america = coffee.createCoffee(type);
        america.addMilk();
        america.addSugger();
        return america;
    }
}
