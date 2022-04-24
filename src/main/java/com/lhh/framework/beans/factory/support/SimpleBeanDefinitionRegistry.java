package com.lhh.framework.beans.factory.support;

import com.lhh.framework.beans.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/24 19:52
 * @Description 注册表接口的子实现类
 */
public class SimpleBeanDefinitionRegistry implements BeanDefinitionRegistry{
    //定义一个容器，用来存储BeanDefinition对象

    private Map<String,BeanDefinition> map = new HashMap<String ,BeanDefinition>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        map.put(beanName, beanDefinition);
    }

    @Override
    public void removeBeanDefinition(String beanName) throws Exception {
        map.remove(beanName);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws Exception {
        return map.get(beanName);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return map.containsKey(beanName);
    }

    @Override
    public int getBeanDefinitionCount() {
        return map.size();
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return map.keySet().toArray(new String[0]);
    }
}
