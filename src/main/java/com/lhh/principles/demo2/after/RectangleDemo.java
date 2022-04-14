package com.lhh.principles.demo2.after;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 17:05
 * @Description
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(20);
        rect.setWidth(10);
        setSize(rect);
        printLengthAndWidth(rect);
    }

    public static void setSize(Rectangle rec) {
        while (rec.getWidth() <= rec.getLength()) {
            rec.setWidth(rec.getWidth()+1);
        }
    }
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}
