package com.lhh.pattern.adapter.object_adapter;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 17:55
 * @Description
 */
public class SDadapterTF implements SDCard {

    private TFCardImpl  readTFCard;

    public SDadapterTF(TFCardImpl readTFCard) {
        this.readTFCard = readTFCard;
    }

    @Override
    public String readSD() {
        System.out.println("apapt read tf card ");
        return readTFCard.readTFCard();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapt read tf card:" + msg);
    }
}
