package com.lhh.pattern.bridge;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 22:55
 * @Description
 */
public class Windows extends OperatingSystem{
    public Windows(VidemoFile videmoFile) {
        super(videmoFile);
    }

    @Override
    public void play(String fileName) {
        videmoFile.decode(fileName);
    }
}
