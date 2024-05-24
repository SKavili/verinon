package com.verinon.core.thread;
import java.io.*;
 
class Test {
     void testFunction(int n) throws InterruptedException
    {
        // synchronized method
        synchronized(this) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(n + i);
           
                Thread.sleep(500);
             
             
        }
    }
    }
}
 
// Driver Class
public class SynchronizationDemo {
    // Main function
    public static void main(String args[])
    {
        // only one object
        final Test obj = new Test();
 
        Thread a = new Thread() {
            public void run() {
                try {
                 obj.testFunction(15); 
                 } catch (InterruptedException e) {
                    System.out.println(e);
                }}
        };
 
        Thread b = new Thread() {
            @Override
            public void run() { 
                try {
                 obj.testFunction(25); 
                 obj.testFunction(30); 
                 } catch (InterruptedException e) {
                    System.out.println(e);
                    Thread.currentThread().interrupt();
                    
                }
                
            }
        };
        a.start();
        b.start();
    }
}
