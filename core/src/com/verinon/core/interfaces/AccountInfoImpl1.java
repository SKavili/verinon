package com.verinon.core.interfaces;

public abstract class AccountInfoImpl1 extends AccountInfo implements Account, Account1{
   
   public  abstract void deposit() ;


   public void withdraw(){

      int bal =10;
      System.err.println(bal);
   }
 

}