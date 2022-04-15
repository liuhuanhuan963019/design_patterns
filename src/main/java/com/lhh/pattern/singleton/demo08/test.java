package com.lhh.pattern.singleton.demo08;

import java.lang.reflect.Constructor;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 16:10
 * @Description
 */
public class test {
    public static void main(String[] args) throws Exception{
        // 1.获取singleton的字节码对象
        Class<Singleton> singletonClass = Singleton.class;
        // 2.获取无参构造方法对象
        Constructor cons = singletonClass.getDeclaredConstructor();
        // 3.取消访问检查
        cons.setAccessible(true);
        // 4.创建singleton对象
        Singleton singleton = (Singleton) cons.newInstance();
        Singleton singleton2 = (Singleton) cons.newInstance();
        // 如果返回true,说明没有破坏，如果返回false，说明破坏了
        System.out.println(singleton2 == singleton);
    }
}
