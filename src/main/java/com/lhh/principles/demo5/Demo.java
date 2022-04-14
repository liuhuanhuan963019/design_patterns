package com.lhh.principles.demo5;

import com.sun.javafx.css.Combinator;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 19:31
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        Company company = new Company("南京胖胖有限公司");

        Fans fans = new Fans("胖胖");

        Star star = new Star("许嵩");

        Agent agent = new Agent();
        agent.setCompany(company);
        agent.setFans(fans);
        agent.setStar(star);

        agent.business();
        agent.meeting();

    }
}
