package com.lhh.pattern.adapter.object_adapter;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 17:53
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer();
        String s = computer.readSD(new SDCardImpl());
        System.out.println(s);

        System.out.println("=============================");

        SDadapterTF sDadapterTF = new SDadapterTF(new TFCardImpl());
        String s1 = computer.readSD(sDadapterTF);
        System.out.println(s1);
    }
}
