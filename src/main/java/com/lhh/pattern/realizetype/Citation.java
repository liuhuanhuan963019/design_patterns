package com.lhh.pattern.realizetype;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 21:00
 * @Description
 */
public class Citation implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "同学成绩优异，特发此状，以此鼓励");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
