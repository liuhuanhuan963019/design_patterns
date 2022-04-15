package com.lhh.pattern.factory.after.factory_method;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 16:57
 * @Description
 */
public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugger();
        return coffee;
    }

}
