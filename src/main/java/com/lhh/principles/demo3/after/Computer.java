package com.lhh.principles.demo3.after;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 18:52
 * @Description
 */
public class Computer {

    private HardDIsk hardDIsk;

    private Cpu cpu;

    private Memory memory;

    public HardDIsk getHardDIsk() {
        return hardDIsk;
    }

    public void setHardDIsk(HardDIsk hardDIsk) {
        this.hardDIsk = hardDIsk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void run() {
        System.out.println("开始运行计算机");
        String data = hardDIsk.get();
        System.out.println("从希捷硬盘中获取数据"+data);
        cpu.run();
        memory.save();
    }
}
