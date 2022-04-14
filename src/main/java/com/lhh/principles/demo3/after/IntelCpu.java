package com.lhh.principles.demo3.after;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 18:50
 * @Description
 */
public class IntelCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("使用英特尔cpu运行电脑");
    }
}
