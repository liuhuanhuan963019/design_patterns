package com.lhh.principles.demo3.after;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 18:49
 * @Description
 */
public class XiJIeDIsk implements HardDIsk{

    @Override
    public void save(String data) {
        System.out.println("在希捷硬盘上保存数据:"+data);
    }

    @Override
    public String get() {
        System.out.println("从希捷硬盘上获取数据");
        return "data";
    }
}
