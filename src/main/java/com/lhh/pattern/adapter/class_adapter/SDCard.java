package com.lhh.pattern.adapter.class_adapter;/**
 * @author  liuhuanhuan
 * @date  2022/4/19 16:50
 * @version 1.0
 * @Description  具体类
 */
public interface SDCard {

    // 读取SD
   public String readSD();
   // 写入SD
   public void writeSD(String msg);
}
