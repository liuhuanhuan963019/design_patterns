package com.lhh.pattern.observer;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 21:17
 */
public interface Subject {

    public void addObserver(oberver observer);

    public void removeObserver(oberver observer);

    public void notifyObserver();
}
