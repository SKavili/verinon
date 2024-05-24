package com.verinon.core.thread;

public class ThreadNameDemo extends Thread{


  public ThreadNameDemo(String name){
    super(name);
  
  }



    public static void main(String[] args) {
      ThreadNameDemo td1= new ThreadNameDemo("Thread1...");
      ThreadNameDemo td2= new ThreadNameDemo("Thread2...");
      ThreadNameDemo td3= new ThreadNameDemo("Thread3...");
      ThreadNameDemo td4= new ThreadNameDemo("Thread4...");
     
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
     
      {
      for(int i=1; i<5; i++){
      
        System.out.println(getName() + i);
        
    }
  }
    }
    
    void printdata(){
    
      
        for(int i=1; i<100000000; i++){
            for(int j=1; j<1; j++){
            }
    
           
        }
    }
    
    }
    