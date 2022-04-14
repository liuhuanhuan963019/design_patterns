package com.lhh.principles.demo1;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 16:11
 */
public class Client {
    public static void main(String[] args) {
        // 1、创建搜狗输入法对象
        SouguInput input = new SouguInput();
        //2.创建皮肤对象
//        DefaultSkin skin = new DefaultSkin();
        HeimaSkin skin = new HeimaSkin();
        //3.将皮肤设置到输入法当中
        input.setSkin(skin);
        //4.显示皮肤
        input.display();
    }
}
