package com.lhh.framework.utils;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/24 20:42
 * @Description
 */
public class StringUtils {

    private StringUtils() {
    }

    // userDao == ?setUserDao
    public static String getSetterMethodByFieldName(String name) {
        String methodName  = "set" + name.substring(0,1).toUpperCase()+name.substring(1);
        return methodName;
    }
}
