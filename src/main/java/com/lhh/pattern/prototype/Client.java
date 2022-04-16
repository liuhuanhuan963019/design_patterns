package com.lhh.pattern.prototype;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 20:56
 * @Description
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();
        RealizeType clone = realizeType.clone();
        System.out.println("判断两个对象地址是否相同" + (realizeType==clone));
    }
}
