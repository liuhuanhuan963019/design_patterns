package com.lhh.pattern.expression;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 21:59
 * 抽象表达式类
 */
public abstract class AbstractExpression {

    public abstract int interpret(Context context);
}
