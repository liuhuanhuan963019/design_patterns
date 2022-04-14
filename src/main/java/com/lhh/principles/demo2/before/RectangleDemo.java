package com.lhh.principles.demo2.before;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/14 16:34
 * @Description
 */
public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle c = new Rectangle();
        c.setWidth(20);
        c.setLength(21);
        // 进行扩宽操作
        setSize(c);
        printLengthAndWidth(c);
        System.out.println("================================");
        Square s = new Square();
        s.setWidth(10);
        setSize(s);
        printLengthAndWidth(s); // 运行出错，违反了里式代换原则
    }
    // 进行扩宽的操作
    public static void setSize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
