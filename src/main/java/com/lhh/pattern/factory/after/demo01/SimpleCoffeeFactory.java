package com.lhh.pattern.factory.after.demo01;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 19:06
 * @Description
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) throws Exception {
        Coffee coffee = null;
        if (type == "america") {
            coffee = new AmericanCoffee();
        } else if(type == "Natie") {
            coffee = new NatieCoffee();
        } else {
            throw new Exception("本店没有此种咖啡");
        }
        return coffee;
    }
}
