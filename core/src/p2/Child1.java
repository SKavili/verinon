package p2;
import p1.*;
public class Child1 {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Parent p = new Parent();
        System.out.println(p.publicVar);
       // System.out.println(p.defaultVar);  // accessible in same package
       // System.out.println(p.protectedVar); // in derived classes (sub classes)
       // System.out.println(p.privateVar); // same class
    }
}
