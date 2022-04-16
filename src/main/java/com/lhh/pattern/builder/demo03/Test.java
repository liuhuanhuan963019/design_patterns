package com.lhh.pattern.builder.demo03;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/16 19:32
 * @Description
 */
public class Test {

    public static void main(String[] args) {
//        Director director = new Director(new MobaBuilder());
        MobaBuilder mobaBuilder = new MobaBuilder();
        Bike construct = mobaBuilder.construct();
        System.out.println(construct.getFrame());
        System.out.println(construct.getSeat());
    }
}
