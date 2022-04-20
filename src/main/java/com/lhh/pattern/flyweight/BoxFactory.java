package com.lhh.pattern.flyweight;

import java.util.HashMap;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/20 16:15
 * @Description
 */
public class BoxFactory {

    private HashMap<String, AbstractWeight> map;

    private BoxFactory() {
        map = new HashMap<String, AbstractWeight>();
        AbstractWeight iBox = new IBox();
        AbstractWeight lBox = new LBox();
        AbstractWeight oBox = new OBox();
        map.put("I", iBox);
        map.put("L", lBox);
        map.put("O", oBox);
    }

    private static BoxFactory boxFactory = new BoxFactory();

    public static BoxFactory  getInstance() {
        return boxFactory;
    }
    public AbstractWeight getBox(String key) {
        return map.get(key);
    }
}
