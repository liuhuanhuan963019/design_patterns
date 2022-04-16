package com.lhh.pattern.builder.demo04;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/16 19:48
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .memory("金士顿")
                .screen("三星")
                .mainBoard("华硕")
                .createPhone();
    }
}
