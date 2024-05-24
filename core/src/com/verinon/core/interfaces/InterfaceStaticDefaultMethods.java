package com.verinon.core.interfaces;

public interface InterfaceStaticDefaultMethods {
  default void printAcctStmt(){
     System.out.println("Account Statement");
 }
 static void printPassBook(){
     System.out.println("PassBook");
 }

}