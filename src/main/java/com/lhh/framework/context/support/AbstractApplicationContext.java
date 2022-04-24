package com.lhh.framework.context.support;

import com.lhh.framework.beans.BeanDefinition;
import com.lhh.framework.beans.factory.support.BeanDefinitionReader;
import com.lhh.framework.beans.factory.support.BeanDefinitionRegistry;
import com.lhh.framework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/24 20:25
 * @Description applicationContext接口的子实现类，用于立即加载
 */
public abstract class AbstractApplicationContext implements ApplicationContext {

    // 声明解析器
    protected BeanDefinitionReader beanDefinitionReader;
    //用来存储bean对象的容器   key存储的是bean的id值，value存储的是bean对象
    protected Map<String, Object> singletonObjects = new HashMap<String, Object>();

    //存储配置文件的路径
    protected String configLocation;

    @Override
    public void refresh() throws IllegalStateException, Exception {

        //加载BeanDefinition
        beanDefinitionReader.loadBeanDefinitions(configLocation);

        //初始化bean
        finishBeanInitialization();
    }

    //bean的初始化
    private void finishBeanInitialization() throws Exception {
        //获取对应的注册表对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        // 获取beanDefinition对象
        String[] beanNames = registry.getBeanDefinitionNames();

        // 进行bean初始化对象
        for (String beanName : beanNames) {
            BeanDefinition beanDefinition = registry.getBeanDefinition(beanName);
            getBean(beanName);
        }
    }
}
