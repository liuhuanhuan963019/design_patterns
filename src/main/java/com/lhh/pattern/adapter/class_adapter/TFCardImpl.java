package com.lhh.pattern.adapter.class_adapter;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 17:10
 * @Description 适配者类
 */
public class TFCardImpl implements TFCard{
    @Override
    public String readTFCard() {
        String msg = "TF card read：hello world!! TF";
        return msg;
    }

    @Override
    public void writeTFCard(String msg) {
        System.out.println("TF card write：hello world!! TF" + msg);
    }
}
