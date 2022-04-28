package com.lhh.pattern.expression;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 21:59
 * 环境类
 */
public class Context {
    //定义一个集合用来存储变量和对应的值
    private Map<Variable,Integer> map = new HashMap<Variable, Integer>();

    // 添加变量的功能
    public void assign(Variable variable,Integer value) {
        map.put(variable,value);
    }

    // 更具变量获取对应的值
    public int getvalue(Variable var) {
        return map.get(var);
    }

}
