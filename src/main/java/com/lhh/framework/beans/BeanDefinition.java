package com.lhh.framework.beans;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/24 19:48
 * @Description 用来封装bean标签数据
 * id 属性
 */
public class BeanDefinition {

    private String id;

    private String name;

    private MutablePropertyValues propertyValues;

    public BeanDefinition() {
        propertyValues = new MutablePropertyValues();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MutablePropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(MutablePropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
