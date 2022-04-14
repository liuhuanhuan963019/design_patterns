package com.lhh.principles.demo4.after;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 19:07
 * @Description
 */
public class HeimaSafetyDoor implements Fireproof,AntiTheft,Waterproof{
    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
