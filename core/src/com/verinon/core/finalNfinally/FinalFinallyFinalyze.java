package com.verinon.core.finalNfinally;

public final class FinalFinallyFinalyze {
    public static void main(String[] args) {
        FinalFinallyFinalyze f = new FinalFinallyFinalyze();
        f.m1();
    }

   final void m1(){
    for( int i = 0; i <2000; i++) {
           System.gc();
    }

    try{

    
    }catch(Exception e){

    }finally{
        System.out.println("Finally - I am finally the last one to get executed automatically");
    }
  }

   

   @Override
   protected void finalize() throws Throwable {
       // TODO Auto-generated method stub

      
       System.out.println("In finalization");
   }
}

 class Claim extends FinalFinallyFinalyze{ // you cannt subclass a final class

}



