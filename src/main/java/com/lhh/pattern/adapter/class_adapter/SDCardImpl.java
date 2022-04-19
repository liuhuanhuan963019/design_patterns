package com.lhh.pattern.adapter.class_adapter;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 16:55
 * @Description 具体的SD卡
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "SD card read:Hello world! SD";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SD card write" + msg);
    }
}
