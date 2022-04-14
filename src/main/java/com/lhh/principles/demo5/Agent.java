package com.lhh.principles.demo5;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 19:29
 * @Description
 */
public class Agent {

    private Star star;

    private Fans fans;

    private Company company;

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    //与粉丝见面
    public void meeting() {
        System.out.println(star.getName() + "与粉丝" + fans.getName() + "见面");
    }
    //与公司会谈
    public void business() {
        System.out.println(star.getName() + "与公司" + company.getName() + "洽谈");
    }
}
