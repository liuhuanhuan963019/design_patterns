package com.lhh.pattern.state.before;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/21 19:43
 */
public class Client {
    public static void main(String[] args) {
        Lift  lift = new Lift();
        lift.setState(ILift.OPENING_STATE);

        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
