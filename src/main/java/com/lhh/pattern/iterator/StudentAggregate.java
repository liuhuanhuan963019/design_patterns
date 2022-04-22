package com.lhh.pattern.iterator;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 20:47
 */
public interface StudentAggregate {

    public void addStudent(Student student);

    public void removeStudent(Student student);

    public StudentLterator getStudentLterator();
}
