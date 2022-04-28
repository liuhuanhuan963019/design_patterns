package com.lhh.pattern.expression;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 22:04
 */
public class Minus extends AbstractExpression{
    // -号左边的表达式
    private AbstractExpression left;
    // -号左边的表达式
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "("+left.toString()+"-"+right.toString()+")";
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }
}
