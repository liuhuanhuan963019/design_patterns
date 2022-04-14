package com.lhh.principles.demo4.before;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 19:04
 * @Description
 */
public class HeimaSatetyDoor implements SafetyDoor{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
