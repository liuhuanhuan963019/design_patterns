package com.lhh.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 20:52
 */
public class StudentIteratorImpl implements StudentLterator{
    private List<Student> list;

    private int position = 0;  // 用来记录遍历时的位置

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        // 从几个中获取指定对象元素
        Student student = list.get(position);
        position++;
        return student;
    }
}
