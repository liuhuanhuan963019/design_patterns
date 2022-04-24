package com.lhh.framework.context;

import com.lhh.framework.beans.BeanFactory;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/24 20:22
 * @Description 定义非延时加载功能
 */
public interface ApplicationContext extends BeanFactory {
    //进行配置文件加载并进行对象创建
    void refresh() throws IllegalStateException, Exception;
}
