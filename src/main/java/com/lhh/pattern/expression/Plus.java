package com.lhh.pattern.expression;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 22:03
 */
public class Plus extends AbstractExpression{

    // +号左边的表达式
    private AbstractExpression left;
    // +号右边的表达式
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "("+left.toString()+"+"+right.toString()+")";
    }

    @Override
    public int interpret(Context context) {
        // 将左边表达式的结果和右边表达式的结果相加
        return left.interpret(context) + right.interpret(context);
    }
}
