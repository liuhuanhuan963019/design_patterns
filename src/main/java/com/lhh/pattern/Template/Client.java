package com.lhh.pattern.Template;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/20 17:13
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        ConcreteClass_BaoCai  concreteClass_baoCai = new ConcreteClass_BaoCai();
        concreteClass_baoCai.cookProcess();

        ConcreteClass_CaiXin concreteClass_caiXin = new ConcreteClass_CaiXin();
        concreteClass_caiXin.cookProcess();

    }
}
