package p2;
import p1.*;

public class Child extends Parent {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Child c = new Child();
        System.out.println(c.publicVar);
       // System.out.println(c.defaultVar);  // same package
        System.out.println(c.protectedVar);
       // System.out.println(p.privateVar);
    }
}
