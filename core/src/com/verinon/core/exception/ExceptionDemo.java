package com.verinon.core.exception;

public class ExceptionDemo {
   int sno = 0;
   public static void main(String[] args) {
         ExceptionDemo exceptionDemo = new ExceptionDemo();
         exceptionDemo.m1();
        
        
        try {
            exceptionDemo.m2();
        } catch (Exception e) {
            e.printStackTrace();
        }
         
    }
public static void m1() {
    ExceptionDemo e1 =  new ExceptionDemo();
      System.out.println(new ExceptionDemo().sno);
       
      try{

        int i = 3/1;
        System.out.println("test2 ");

        int i1 = 3/0;
        System.out.println("test3 ");
      }catch(ArithmeticException e){
      

      } catch(Exception e){
        //System.out.println(e.getMessage());
 
      }
        
    
   
}

public static void m2() throws ArithmeticException{
    

        int i = 3/1;
        System.out.println("test2 ");

        int i1 = 3/0;
        System.out.println("test3 ");
   
}
}

