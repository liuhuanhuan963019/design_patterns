package com.lhh.pattern.prototype;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 20:55
 * @Description
 */
public class RealizeType implements Cloneable{

    public RealizeType() {
        System.out.println("具体的原型对象创建成功");
    }

    @Override
    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("复制的对象创建成功");
        return (RealizeType) super.clone();
    }
}
