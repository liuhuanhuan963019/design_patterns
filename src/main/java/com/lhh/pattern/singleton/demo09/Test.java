package com.lhh.pattern.singleton.demo09;

import java.io.InputStream;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 16:34
 * @Description
 */
public class Test {
    public static void main(String[] args) throws Exception{
        // 获取runtime对象
        Runtime runtime = Runtime.getRuntime();

        //调用runtime的exec方法。，参数要的是一个命令
        Process process = runtime.exec("ipconfig");
        //调用process对象的获取输入流的方法
        InputStream is = process.getInputStream();
        byte[] array = new byte[1024*1024*100];
        int read = is.read(array);
        System.out.println(new String(array,0,read,"GBK"));
    }
}
