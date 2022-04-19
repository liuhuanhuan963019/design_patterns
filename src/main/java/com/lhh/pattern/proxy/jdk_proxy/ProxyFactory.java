package com.lhh.pattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/19 14:15
 * @Description 获取代理对象的工厂类
 */
public class ProxyFactory {
    private TrainStation station = new TrainStation();

    //获取代理对象的方法
    public SellTicket getProxyObject() {
        //返回代理对象
        /*
                newProxyInstance()方法参数说明：
                ClassLoader loader ： 类加载器，用于加载代理类，使用真实对象的类加载器即可
                Class<?>[] interfaces ： 真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
                InvocationHandler h ： 代理对象的调用处理程序
         */
        return (SellTicket) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                 /*
                        InvocationHandler中invoke方法参数说明：
                            proxy ： 代理对象 和proxyObject是同一个方法
                            method ： 对应于在代理对象上调用的接口方法的 Method 实例
                            args ： 代理对象调用接口方法时传递的实际参数
                     */
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代售点收取一定的费用，jdk动态代理");
                        // 执行目标对象的方法
                        Object invoke = method.invoke(station, args);
                        return invoke;
                    }
                }
        );
    }
}
