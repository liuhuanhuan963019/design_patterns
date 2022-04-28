package com.lhh.pattern.expression;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 22:02
 * 减法表达式
 */
public class Value extends AbstractExpression{

    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Value{" +
                "value=" + value +
                '}';
    }

    @Override
    public int interpret(Context context) {
        return 0;
    }
}
