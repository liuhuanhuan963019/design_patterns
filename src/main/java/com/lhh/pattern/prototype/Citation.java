package com.lhh.pattern.prototype;

import java.io.Serializable;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 21:00
 * @Description
 */
public class Citation implements Cloneable, Serializable {

    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    void show() {
        System.out.println(stu.getName() + "同学成绩优异，特发此状，以此鼓励");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
