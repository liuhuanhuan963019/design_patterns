package com.lhh.pattern.realizetype;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/15 21:01
 * @Description
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Citation clone = citation.clone();
        citation.setName("张三");
        clone.setName("李四");
        citation.show();
        clone.show();
    }
}
