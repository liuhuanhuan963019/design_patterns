package com.lhh.pattern.factory.before;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 16:57
 * @Description
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) throws Exception {
        Coffee coffee = null;
        if (type == "american") {
                coffee = new AmericanCoffee();
        } else if(type == "Natie") {
            coffee = new NatieCoffee();
        } else {
            throw new Exception("本店没有此种咖啡");
        }
        coffee.addMilk();
        coffee.addSugger();
        return coffee;
    }

}
