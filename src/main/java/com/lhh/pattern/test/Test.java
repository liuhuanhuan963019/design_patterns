package com.lhh.pattern.test;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/20 16:44
 * @Description
 */
public class Test {
   private Test() {

   }
   
   public static class DEmo {
       public static final Test test = new Test(); 
   }
   
   public static Test getInstance() {
       return DEmo.test;
   }
}
