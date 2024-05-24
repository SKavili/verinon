package com.verinon.core.exception;

public class Sub extends Super {
  
  @Override
    public int add(int a, int b)  throws ArithmeticException {
        System.err.println("in sub class");
        return a+b;
      }

       
    public int add1(int a, int b)  throws ArithmeticException {
        System.err.println("in sub class");
        return a+b;
      }


      public static void main(String[] args) {
       Sub s = new Sub();
        s.add(3, 4);
    
      }
      @Override

      public void cancel(){

      }
}

