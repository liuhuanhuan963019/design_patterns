package com.lhh.pattern.combiation;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/20 15:41
 * @Description 菜单组件（属于抽象根节点）
 */
public abstract class MenuComponent {

    protected String name;  // 菜单组件名称

    protected int level;   // 菜单组件层级

    // 添加子菜单
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    // 移除子菜单
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int level) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}
