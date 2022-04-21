package com.lhh.pattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 18:14
 * @Description 订单类
 */
public class Order {
    private int diningTable; //下单的餐桌

    //所下菜品和个数
    private Map<String,Integer> foodDic = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFood(String foodName,int num) {
        foodDic.put(foodName,num);
    }
}
