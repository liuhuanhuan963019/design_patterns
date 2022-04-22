package com.lhh.pattern.memmeto.white_box;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 21:41
 * 备忘录角色管理类
 */
public class RoleStateCaretaker {
    // 声明RoleStateMemento对象
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
