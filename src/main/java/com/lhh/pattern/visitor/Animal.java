package com.lhh.pattern.visitor;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 21:15
 */
public interface Animal {

    // 接受访问者访问的功能
    public void accept(Person person);
}
