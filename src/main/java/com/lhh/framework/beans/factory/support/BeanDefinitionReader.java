package com.lhh.framework.beans.factory.support;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/24 19:56
 * @Description 用来解析配置文件，改接口只是用来定义规范的
 */
public interface BeanDefinitionReader {
    //获取注册表对象
    BeanDefinitionRegistry getRegistry();
    //加载配置文件并在注册表中进行注册
    void loadBeanDefinitions(String configLocation) throws Exception;
}
