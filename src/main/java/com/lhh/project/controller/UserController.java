package com.lhh.project.controller;

import com.lhh.framework.context.ApplicationContext;
import com.lhh.framework.context.support.ClassPathXmlApplicationContext;
import com.lhh.project.service.UserService;
import org.springframework.beans.factory.BeanFactory;


/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/24 17:51
 * @Description
 */
public class UserController {

    public static void main(String[] args) throws Exception {
//        // 1.创建spring 容器对象  创建的时候，就已经将相关bean都实例化好了
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2.从容器对象中获取userservice对象
        UserService userService = applicationContext.getBean("userService", UserService.class);
        // 3.调用userService进行逻辑判断处理
        userService.add();

//        //1.创建容器对象并不会去自动化实例化对象
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        //2.使用容器中的getbean创建对象，spring自动帮我们去调用 延迟加载
//        UserService userService = beanFactory.getBean("userService", UserService.class);
//        userService.add();
    }
}
