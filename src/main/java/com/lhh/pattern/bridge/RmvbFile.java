package com.lhh.pattern.bridge;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 22:51
 * @Description
 */
public class RmvbFile implements VidemoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb 播放" + fileName);
    }
}
