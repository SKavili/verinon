package com.verinon.core.thread;

public class RunnableDemo implements Runnable {

    public static void main(String[] args) {


      RunnableDemo r1= new RunnableDemo();
      RunnableDemo r2= new RunnableDemo();
      RunnableDemo r3= new RunnableDemo();
      RunnableDemo r4= new RunnableDemo();
      Thread t1 = new Thread(r1);
      Thread t2 = new Thread(r2);
      Thread t3 = new Thread(r3);
      Thread t4 = new Thread(r4);
      t4.setPriority(10);
     

      long stat = System.currentTimeMillis();
      //td.printdata();
     // td1.start();
     // td2.start();
    
     
     //td1.printdata();td1.printdata();td1.printdata();td1.printdata();
     t1.start(); t2.start();t3.start();t4.start();
    
      long end = System.currentTimeMillis();
      System.out.println(end-stat);
    }
    
    @Override
    public void run() {
         
      for(int i=1; i<100000000; i++){
        for(int j=1; j<1; j++){
        }
    
        //System.out.println(i);
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
    