package com.verinon.core.exception;
import com.verinon.core.statictest.StaticDemo;

public class Super {
   
  public int add(int a, int b) throws ArithmeticException  {
    System.err.println("in Super class");
    return a+b;
  }
  public int add1(int a, int b) throws Exception  {
    System.err.println("in Super class");
    return a+b;
  }

   void cancel(){
    StaticDemo sd = new StaticDemo();
    sd.m1();

  }
}

