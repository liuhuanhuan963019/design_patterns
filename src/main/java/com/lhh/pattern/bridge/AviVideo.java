package com.lhh.pattern.bridge;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 22:50
 * @Description
 */
public class AviVideo implements VidemoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi播放" + fileName);
    }
}
