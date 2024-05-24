package com.verinon.core.interfaces;

public class SBAccount implements Account{
   public void deposit() {
       int amount = 10;
       float interest = amount * 0.001f;

       System.out.println(interest);;
   }
   public void withdraw(){}
   public  void update(){}
   public void create(){

      throw new UnsupportedOperationException("Subclasses must override the create() method.");
   }

}