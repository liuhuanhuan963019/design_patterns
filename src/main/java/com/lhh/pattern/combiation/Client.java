package com.lhh.pattern.combiation;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/20 15:54
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        MenuComponent  menuComponent1 = new Menu("菜单管理",2);
        menuComponent1.add(new MenuItem("页面访问",3));
        menuComponent1.add(new MenuItem("展开菜单",3));
        menuComponent1.add(new MenuItem("编辑菜单",3));
        menuComponent1.add(new MenuItem("删除菜单",3));
        menuComponent1.add(new MenuItem("新增菜单",3));
        MenuComponent  menuComponent2 = new Menu("权限管理",2);
        menuComponent2.add(new MenuItem("页面访问",3));
        menuComponent2.add(new MenuItem("提交保存",3));
        MenuComponent  menuComponent3 = new Menu("角色管理",2);
        menuComponent3.add(new MenuItem("页面访问",3));
        menuComponent3.add(new MenuItem("新增角色",3));
        menuComponent3.add(new MenuItem("修改角色",3));
        MenuComponent menuComponent4 = new Menu("系统管理",1);
        menuComponent4.add(menuComponent1);
        menuComponent4.add(menuComponent2);
        menuComponent4.add(menuComponent3);
        menuComponent4.print();
    }
}
