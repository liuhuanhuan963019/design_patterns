package com.lhh.principles.demo3.after;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 18:52
 * @Description
 */
public class KingStongMemory implements Memory{
    @Override
    public void save() {
        System.out.println("使用金士顿作为内存条");
    }
}
