package com.lhh.principles.demo3.before;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 18:44
 * @Description
 */
public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        XiJieHardDisk xiJieHardDisk = new XiJieHardDisk();
        IntelCpu intelCpu = new IntelCpu();
        KingstonMemory kingstonMemory = new KingstonMemory();
        computer.setXiJieHardDisk(xiJieHardDisk);
        computer.setIntelCpu(intelCpu);
        computer.setKingstonMemory(kingstonMemory);
        computer.run();
    }

}
