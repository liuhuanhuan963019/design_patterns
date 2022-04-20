package com.lhh.pattern.combiation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/20 15:43
 * @Description
 */
public class Menu extends MenuComponent{

    // 菜单可以有多个子菜单或者子菜单项
    private List<MenuComponent> menuComponentList = new ArrayList<MenuComponent>();

    // 构造方法
    public Menu(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int level) {
        return menuComponentList.get(level);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void print() {
        // 打印菜单名称
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);

        // 打印子菜单或者子菜单项名称
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
