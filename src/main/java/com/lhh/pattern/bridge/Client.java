package com.lhh.pattern.bridge;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 22:56
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new Mac(new AviVideo());
        operatingSystem.play("战狼2");
    }
}
