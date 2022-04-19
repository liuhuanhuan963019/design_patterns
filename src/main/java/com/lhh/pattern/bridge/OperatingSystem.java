package com.lhh.pattern.bridge;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 22:51
 * @Description
 */
public abstract class OperatingSystem {

    protected VidemoFile videmoFile;

    public OperatingSystem(VidemoFile videmoFile) {
        this.videmoFile = videmoFile;
    }

    public abstract void play(String fileName);
}
