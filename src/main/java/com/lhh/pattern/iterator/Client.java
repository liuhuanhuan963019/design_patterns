package com.lhh.pattern.iterator;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 21:01
 */
public class Client {

    public static void main(String[] args) {
        // 创建聚合对象
        StudentAggregateImpl student = new StudentAggregateImpl();
        student.addStudent(new Student("张三","1"));
        student.addStudent(new Student("张四","2"));
        student.addStudent(new Student("张五","3"));
        student.addStudent(new Student("张六","4"));
        student.addStudent(new Student("张七","5"));

        StudentLterator studentLterator = student.getStudentLterator();
        while (studentLterator.hasNext()) {
            Student next = studentLterator.next();
            System.out.println(next.toString());
        }

    }
}
