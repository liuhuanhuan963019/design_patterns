package com.lhh.framework.beans;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/24 20:20
 * @Description  ioC容器父接口
 */
public interface BeanFactory {

    //根据bean对象的名称获取bean对象
    Object getBean(String name) throws Exception;
    //根据bean对象的名称获取bean对象，并进行类型转换
    <T> T getBean(String name, Class<? extends T> clazz) throws Exception;
}
