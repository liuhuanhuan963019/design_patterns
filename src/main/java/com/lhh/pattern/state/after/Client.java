package com.lhh.pattern.state.after;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 21:12
 */
public class Client {
    public static void main(String[] args) {
        // 创建环境角色对象
        Context context = new Context();

        // 设置当前电梯状态
        context.setLiftState(new OpenningState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
