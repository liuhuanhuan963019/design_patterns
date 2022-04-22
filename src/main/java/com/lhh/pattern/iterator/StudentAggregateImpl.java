package com.lhh.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 20:54
 */
public class StudentAggregateImpl implements StudentAggregate{
    private List<Student> list = new ArrayList<Student>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        int index = list.indexOf(student);
        if (index >= 0) {
            list.remove(index);
        }
    }

    @Override
    public StudentLterator getStudentLterator() {
        return new StudentIteratorImpl(list);
    }
}
