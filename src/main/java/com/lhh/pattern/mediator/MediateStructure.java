package com.lhh.pattern.mediator;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 20:21
 */
public class MediateStructure extends Mediator{
    private HouseOwner hoseOwner;

    private Tenant tenant;

    public HouseOwner getHoseOwner() {
        return hoseOwner;
    }

    public void setHoseOwner(HouseOwner hoseOwner) {
        this.hoseOwner = hoseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, Person person) {
        if(person == hoseOwner) {
            tenant.getMessage(message);
        } else {
            hoseOwner.getMessage(message);
        }
    }
}
