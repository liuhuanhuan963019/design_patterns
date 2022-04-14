package com.lhh.principles.demo1;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 16:10
 */
public class SouguInput {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }
    public void display() {
        skin.display();
    }
}
