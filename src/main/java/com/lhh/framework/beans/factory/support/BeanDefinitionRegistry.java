package com.lhh.framework.beans.factory.support;

import com.lhh.framework.beans.BeanDefinition;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/24 19:51
 * @Description 注册表对象所属类
 */
public interface BeanDefinitionRegistry {
    //注册BeanDefinition对象到注册表中
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    //从注册表中删除指定名称的BeanDefinition对象
    void removeBeanDefinition(String beanName) throws Exception;

    //根据名称从注册表中获取BeanDefinition对象
    BeanDefinition getBeanDefinition(String beanName) throws Exception;

    boolean containsBeanDefinition(String beanName);

    int getBeanDefinitionCount();

    String[] getBeanDefinitionNames();
}
