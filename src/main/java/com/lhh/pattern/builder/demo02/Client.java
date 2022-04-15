package com.lhh.pattern.builder.demo02;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 22:43
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星")
                .memory("金士顿")
                .mainBoard("华硕")
                .build();
        System.out.println(phone);
    }
}
