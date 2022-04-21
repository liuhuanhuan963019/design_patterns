package com.lhh.pattern.observer;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 21:22
 */
public class Client {
    public static void main(String[] args) {
        Test01 test01 = new Test01();
        test01.setMsg("真都好厉害啊！！！");
        Test02 test02 = new Test02(test01,"lhh");
        Test02 test03 = new Test02(test01,"wcy");
        Test02 test04 = new Test02(test01,"lfg");
        Test02 test05 = new Test02(test01,"hh");
        test01.removeObserver(test02);
        test01.notifyObserver();


    }
}
