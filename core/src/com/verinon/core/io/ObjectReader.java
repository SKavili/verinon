package com.verinon.core.io;
import java.io.*;

public final class ObjectReader {
    public static void main(String[] args) {
        try{
     
   
        FileOutputStream fos = new FileOutputStream(new File("//home//ubuntu//java//text1.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Account acct=null;
        acct = new Account("HDFC00034578234", "Sam Sundar", 30032.99);
        oos.writeObject(acct);
                oos.close();
                fos.close();

         FileInputStream fis = new FileInputStream(new File("//home//ubuntu//java//text1.txt"));
           
         ObjectInputStream ois = new ObjectInputStream(fis);
             Account acct1 = (Account) ois.readObject();
         
         
        
            System.out.println("reading from file  "+ acct1.getAccountNumber());
            ois.close();
            fis.close();

        }catch (Exception e) {
            e.printStackTrace();

        }
    }
    
}

class Account implements Serializable {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
