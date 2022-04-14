package com.lhh.principles.demo3.before;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 18:41
 * @Description
 */
public class Computer {
    XiJieHardDisk xiJieHardDisk = new XiJieHardDisk();

    IntelCpu intelCpu = new IntelCpu();

    KingstonMemory kingstonMemory = new KingstonMemory();

    public Computer() {
    }

    public XiJieHardDisk getXiJieHardDisk() {
        return xiJieHardDisk;
    }

    public void setXiJieHardDisk(XiJieHardDisk xiJieHardDisk) {
        this.xiJieHardDisk = xiJieHardDisk;
    }

    public IntelCpu getIntelCpu() {
        return intelCpu;
    }

    public void setIntelCpu(IntelCpu intelCpu) {
        this.intelCpu = intelCpu;
    }

    public KingstonMemory getKingstonMemory() {
        return kingstonMemory;
    }

    public void setKingstonMemory(KingstonMemory kingstonMemory) {
        this.kingstonMemory = kingstonMemory;
    }

    public void run() {
        System.out.println("运行计算机");
        String data = xiJieHardDisk.get();
        System.out.println("硬盘中获取的数据是"+data);
        intelCpu.run();
        kingstonMemory.save();
    }
}
