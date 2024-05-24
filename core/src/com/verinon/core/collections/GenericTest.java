package com.verinon.core.collections;

import java.util.ArrayList;

public class GenericTest {

  @SuppressWarnings("deprecation")
  public static void main(String[] args) {
    
    ArrayList <Integer> list = new ArrayList();
    Integer i = new Integer(44);
      list.add(i);
      list.add(66);
      list.add(Integer.parseInt("77"));

      int sum = 0;
      for (Integer val : list) {
        //sum=sum + val;
        sum += val;
      }
      System.out.println(sum);
      main1();

  }
  @SuppressWarnings("deprecation")
  public static void main1() {
    
    ArrayList  list = new ArrayList();
    Integer i = new Integer(44);
      list.add(i);
      list.add(66);
      list.add(Integer.parseInt("77"));

      int sum = 0;
      for (Object val : list) {
        //sum=sum + val;
        sum += (Integer)val;
      }
      System.out.println(sum);

  }

}
  



