package com.lhh.pattern.factory.after.expand_factory;

import java.awt.image.ImageProducer;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 20:27
 * @Description
 */
public class CofferFactory {
    // 加载配置文件，获取配置文件中配置的全类名，并创建该类的对象进行存储
    // 1.定义容器对象存储咖啡对象
    private static HashMap<String,Coffee> map = new HashMap<>();

    // 2。加载配置文件，只需要加载一次
    static {
        //2.1 创建properites对象
        Properties props = new Properties();
        // 2.2调用里面的方法进行加载
        // 调用p对象中的load方法进行配置文件的加载
        InputStream resourceAsStream = CofferFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            props.load(resourceAsStream);
            // 从props集合中获取全类名并创建对象
            Set<Object> objects = props.keySet();
            for (Object object : objects) {
                String property = props.getProperty((String) object);
                Class aClass = Class.forName(property);
                Coffee coffee = (Coffee) aClass.newInstance();
                map.put((String) object,coffee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }



    public static Coffee createCoffee(String type) {
        return map.get(type);
    }
}
