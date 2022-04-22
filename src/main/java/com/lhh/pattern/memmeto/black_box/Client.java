package com.lhh.pattern.memmeto.black_box;


/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 21:43
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("打怪前。。。。。");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();
        // 角色状态备份
        // 创建管理者对象
        RoleStateCaretaker rm = new RoleStateCaretaker();
        rm.setMento(gameRole.saveState());

        System.out.println("打怪后。。。。。");
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("恢复到之前的状态");
        gameRole.recoverState(rm.getMento());
        gameRole.stateDisplay();

    }
}
