package com.lhh.pattern.adapter.class_adapter;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 17:12
 * @Description
 */
public class Computer {

    public String readSD(SDCard  sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("未找到数据");
        }
        return sdCard.readSD();
    }
}
