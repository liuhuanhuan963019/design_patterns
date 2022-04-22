package com.lhh.pattern.memmeto.black_box;

import com.lhh.pattern.memmeto.white_box.RoleStateMemento;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 21:41
 * 备忘录角色管理类
 */
public class RoleStateCaretaker {

    private Memento mento;

    public Memento getMento() {
        return mento;
    }

    public void setMento(Memento mento) {
        this.mento = mento;
    }
}
