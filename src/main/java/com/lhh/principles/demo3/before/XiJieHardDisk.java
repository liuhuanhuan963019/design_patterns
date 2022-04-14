package com.lhh.principles.demo3.before;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 18:38
 * @Description
 */
public class XiJieHardDisk {

    public void save(String msg){
        System.out.println("使用希捷硬盘存储数据:"+msg);
    }

    public String get() {
        System.out.println("使用希捷硬盘读取数据");
        return "data";
    }
}
