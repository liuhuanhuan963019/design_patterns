package com.lhh.pattern.mediator;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 20:34
 */
public class Client {
    public static void main(String[] args) {
        // 创建中介者对象
        MediateStructure mediateStructure = new MediateStructure();

        // 创建租房者
        Tenant tenant = new Tenant("liuhuanhuan", mediateStructure);

        // 创建房主
        HouseOwner houseOwner = new HouseOwner("wcy",mediateStructure);

        mediateStructure.setTenant(tenant);

        mediateStructure.setHoseOwner(houseOwner);

        tenant.constact("我需要三室一厅的房子");

        houseOwner.constact("我有这个房子");




    }
}
