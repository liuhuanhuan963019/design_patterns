package com.lhh.pattern.combiation;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/20 15:52
 * @Description 菜单项类，属于叶子节点类
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
