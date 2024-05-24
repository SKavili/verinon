package com.verinon.core.collections;

import java.util.ArrayList;
import java.util.Iterator;



public class CollectionTest  {
  @SuppressWarnings("deprecation")
  public static void main(String[] args) {
    System.out.println("CollectionTest");

ArrayList al = new ArrayList();
Integer i1 = new Integer(33);
Integer j = new Integer("55");

al.add(i1);
al.add(j);
al.add(34);

for (int i = 0; i < al.size(); i++) {
  //System.out.println(al.get(i));
}
Iterator <Integer> it = al.iterator();
while (it.hasNext()) {
  Object obj = it.next();
  System.out.println("Iter"+ obj);
}

for (Object obj : al) {
  System.out.println("EF"+ obj);
  
}

  }
  @SuppressWarnings("deprecation")
  void m1() {

ArrayList <Integer> al = new ArrayList();
Integer i1 = new Integer(33);

Integer j = new Integer("55");

al.add(i1);
al.add(j);
al.add(34);
Iterator <Integer> it = al.iterator();

for (int i = 0; i < al.size(); i++) {
  System.out.println(al.get(i));
}


for (Object obj : al) {
  
}

  }
  

}

