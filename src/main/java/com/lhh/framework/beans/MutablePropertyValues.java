package com.lhh.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/24 19:33
 * @Description
 */
public class MutablePropertyValues implements Iterable<PropertyValue>{

    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<PropertyValue>();
    }

    public MutablePropertyValues(List<PropertyValue> list) {
        if (list == null) {
           this.propertyValueList = new ArrayList<PropertyValue>();
        } else {
            this.propertyValueList = list;
        }
    }

    //获取所有的propertyValue对象，并返回propertyValue数组
    public PropertyValue[] getProperTyValues() {
        // 将集合转换为数组
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }
    //根据property的名称获取propertyValue对象
    public PropertyValue getProperTyValue(String name) {
        //遍历集合对象
        for (PropertyValue propertyValue : propertyValueList) {
            if (propertyValue.getName().equals(name)) {
                return propertyValue;
            }
        }
        return null;
    }
    //判断集合是否为空
    public boolean isEmpty() {
        return propertyValueList.isEmpty();
    }

    //添加property对象
    public MutablePropertyValues addProperty(PropertyValue property) {
        // 判断集合中存储的PropertyValue对象是否和传递进行的重复了，如果重复了，进行覆盖
        for (int i = 0; i < propertyValueList.size(); i++) {
            PropertyValue propertyValue = propertyValueList.get(i);
            if (propertyValue.getName().equals(property.getName())) {
                propertyValueList.set(i,property);
                return this;    // 实现链式编程
            }
        }
        this.propertyValueList.add(property);
        return this;
    }

    //判断是否有指定name属性值的对象
    public boolean contains(String name) {
        return getProperTyValue(name) != null;
    }
    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }
}
