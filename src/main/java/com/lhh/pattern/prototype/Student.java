package com.lhh.pattern.prototype;

import java.io.Serializable;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 21:10
 * @Description
 */
public class Student implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
