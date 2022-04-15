package com.lhh.pattern.factory.after.factory_method;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 19:36
 * @Description
 */
public class AmericaFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
