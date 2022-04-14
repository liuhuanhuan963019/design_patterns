package com.lhh.principles.demo3.after;

import com.sun.javafx.css.Combinator;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 18:54
 * @Description
 */
public class ComputerDemo {
    public static void main(String[] args) {
        HardDIsk hardDIsk = new XiJIeDIsk();
        Cpu cpu = new IntelCpu();
        Memory memory = new KingStongMemory();
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setHardDIsk(hardDIsk);
        computer.setMemory(memory);
        computer.run();
    }
}
