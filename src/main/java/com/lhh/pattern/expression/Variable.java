package com.lhh.pattern.expression;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 22:00
 *
 * 封装变量的类
 */
public class Variable extends AbstractExpression{

    // 声明存储变量名的成员变量
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int interpret(Context context) {
        // 直接返回变量的值
        return context.getvalue(this);
    }
}
