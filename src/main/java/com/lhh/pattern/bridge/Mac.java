package com.lhh.pattern.bridge;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 22:52
 * @Description
 */
public class Mac extends OperatingSystem{

    public Mac(VidemoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String filename) {
        videmoFile.decode(filename);
    }
}

