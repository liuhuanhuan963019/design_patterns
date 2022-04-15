package com.lhh.pattern.singleton.demo07;


import com.lhh.pattern.singleton.demo07.Singleton;

import java.io.*;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 16:01
 * @Description
 */
public class Test {

    public static void main(String[] args) throws Exception {

//            writeObjectData();
        readObjectData();
        readObjectData();
    }

    // 向文件中写数据
    public static void readObjectData() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        Singleton singleton = (Singleton) ois.readObject();
        System.out.println(singleton);
        ois.close();
    }

    //向文件中读数据
    public static void writeObjectData() throws Exception{
        Singleton singletom = Singleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("a.txt"));
        objectOutputStream.writeObject(singletom);
        objectOutputStream.close();
    }
}
