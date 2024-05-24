package com.verinon.core.interfaces;

public class CheckingAccount implements Account{
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

   public static void main(String[] args) {
      CheckingAccount c = new CheckingAccount();
      Account a = new CheckingAccount();
      NationalBank.set(a);
   }

}