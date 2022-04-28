package com.lhh.pattern.expression;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 22:14
 */
public class Client  {
    public static void main(String[] args) {
        //创建环境对象
        Context context = new Context();

        // 创建多个变量对象
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        //将变量存储到环境对象中
        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        context.assign(d,4);

        //获取抽象语法树
        AbstractExpression expr = new Minus(a, new Plus(new Minus(b,c),d));
        //计算
        int interpret = expr.interpret(context);
        System.out.println(interpret);
    }
}
