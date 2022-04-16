package com.lhh.pattern.prototype;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 21:01
 * @Description
 */
public class CitationTest {
    public static void main(String[] args) throws Exception {
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("lhh");
        citation.setStu(student);
        // 创建对象到输出流
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("demo.txt"));
        //将citation对象写出到文件中
        objectOutputStream.writeObject(citation);
        objectOutputStream.close();

        //创建对象出入流对象
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("demo.txt"));
        // 读取对象
        Citation citation1 = (Citation) objectInputStream.readObject();
        objectInputStream.close();

        Student stu = citation1.getStu();
        stu.setName("wcy");
        citation.show();
        citation1.show();
    }
}
