package com.lhh.pattern.test;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/20 16:45
 * @Description
 */
public class clienr {

    public static void main(String[] args) {
        Test  testTest = Test.getInstance();
        Test  testTest2 = Test.getInstance();
        System.out.println(testTest == testTest2);
    }
}
