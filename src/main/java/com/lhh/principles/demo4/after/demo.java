package com.lhh.principles.demo4.after;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 19:09
 * @Description
 */
public class demo {
    public static void main(String[] args) {
        HeimaSafetyDoor heimaSafetyDoor = new HeimaSafetyDoor();
        heimaSafetyDoor.antiTheft();
        heimaSafetyDoor.fireproof();
        heimaSafetyDoor.waterProof();

        System.out.println("============================================");
        IWater iWater = new IWater();
        iWater.waterProof();
    }
}
