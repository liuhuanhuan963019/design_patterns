package com.lhh.pattern.memmeto.white_box;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 21:36
 */
public class RoleStateMemento {

    private int vit;  //生命力

    private int atk; //攻击力

    private int def;   //防御力

    public RoleStateMemento(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public RoleStateMemento() {
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}


