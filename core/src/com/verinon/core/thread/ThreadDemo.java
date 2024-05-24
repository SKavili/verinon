package com.verinon.core.thread;

public class ThreadDemo extends Thread{



    public static void main(String[] args) {
      ThreadDemo td1= new ThreadDemo();
      ThreadDemo td2= new ThreadDemo();
      ThreadDemo td3= new ThreadDemo();
      ThreadDemo td4= new ThreadDemo();
     
      long stat = System.currentTimeMillis();
      //td.printdata();
     // td1.start();
     // td2.start();
    
     
     //td1.printdata();td1.printdata();td1.printdata();td1.printdata();
     td1.start(); td2.start();td3.start();td4.start();
    
      long end = System.currentTimeMillis();
      System.out.println(end-stat);
    }
    
    @Override
    public void run() {
         
      for(int i=1; i<100000; i++){
      
        System.out.println(i);
    }
    }
    
    void printdata(){
    
      
        for(int i=1; i<100000000; i++){
            for(int j=1; j<1; j++){
            }
    
          //  System.out.println(i);
        }
    }
    
    }
    