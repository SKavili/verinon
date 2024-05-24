package com.verinon.core.statictest;

public class StaticDemo2 {

public static int val = 0;
public  int sno = 0;
StaticDemo2(){
    System.out.println("Constructor");
     
}
/*
 * Sharing of static members across the object
 */
public static void main(String[] args) {
    

    StaticDemo2 demo2a = new StaticDemo2();
    StaticDemo2 demo2b = new StaticDemo2();

    System.out.println(val);
    val=1;

   // System.out.println(sno);
    System.out.println(demo2a.val);
    System.out.println(demo2b.val);
    demo2b.val=100;

    System.out.println(val);
 
 
    System.out.println(demo2a.val);
    System.out.println(demo2b.val);

  
}


static {
      System.out.println("Static block independent of methods");
}


}
