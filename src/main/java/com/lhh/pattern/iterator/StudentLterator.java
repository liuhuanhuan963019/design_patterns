package com.lhh.pattern.iterator;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 20:47
 */
public interface StudentLterator {

    // 判断是否还有元素
    public boolean hasNext();

    //获取下一个元素
    public Student next();
}
