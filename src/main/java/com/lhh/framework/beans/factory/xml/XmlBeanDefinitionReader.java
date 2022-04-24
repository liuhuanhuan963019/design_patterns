package com.lhh.framework.beans.factory.xml;

import com.lhh.framework.beans.BeanDefinition;
import com.lhh.framework.beans.MutablePropertyValues;
import com.lhh.framework.beans.PropertyValue;
import com.lhh.framework.beans.factory.support.BeanDefinitionReader;
import com.lhh.framework.beans.factory.support.BeanDefinitionRegistry;
import com.lhh.framework.beans.factory.support.SimpleBeanDefinitionRegistry;
import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogReader;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.List;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/24 19:57
 * @Description 正对xml配置文件进行解析的类
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {
    // 申明注册表对象
    private BeanDefinitionRegistry  registry;

    public XmlBeanDefinitionReader() {
        registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        // 使用dom4j进行xml文件的解析
        SAXReader reader = new SAXReader();
        //获取类路径下的配置文件
        InputStream resourceAsStream = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        Document doc = reader.read(resourceAsStream);
        //根据document获取根标签对象
        Element rootElement = doc.getRootElement();
        // 获取根标签下的所有的bean标签对象
        List<Element> beanElements = rootElement.elements("bean");


        //遍历集合
        for (Element beanElement : beanElements) {
            //获取id属性
            String id = beanElement.attributeValue("id");
            //获取class属性
            String className = beanElement.attributeValue("class");
            //将id属性和class属性封装到beanDefinition
            // 1.创建beanDefinition
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setName(className);
            //创建MutablePropertyValues对象
            MutablePropertyValues propertyValues = new MutablePropertyValues();
            // 获取bean标签下所有的property标签对象
            List<Element> propertyElments = beanElement.elements("property");
            for (Element propertyElment : propertyElments) {
                String name = propertyElment.attributeValue("name");
                String ref = propertyElment.attributeValue("ref");
                String value = propertyElment.attributeValue("value");
                PropertyValue propertyValue = new PropertyValue(name, ref, value);
                propertyValues.addProperty(propertyValue);
            }
            // 将MutablePropertyValues对象封装到BeanDefinition对象中
            beanDefinition.setPropertyValues(propertyValues);
            // 将beandefinition对象注册到registury
            registry.registerBeanDefinition(id,beanDefinition);
        }
    }
}
