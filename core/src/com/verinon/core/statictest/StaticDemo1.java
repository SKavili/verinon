package com.verinon.core.statictest;

public class StaticDemo1 {

public static int val = 0;
public  int sno = 0;

/*
 * Acessing of static members in different ways
 */
public static void main(String[] args) {
    

    StaticDemo1 demo = new StaticDemo1();
    System.out.println(val);
   // System.out.println(sno);
    System.out.println(demo.sno);
    System.out.println(demo.val);
    System.out.println(StaticDemo1.val);
}




}
