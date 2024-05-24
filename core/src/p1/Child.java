package p1;

public class Child extends Parent {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Child p = new Child();
        System.out.println(p.publicVar);
        System.out.println(p.defaultVar);
        System.out.println(p.protectedVar);
       // System.out.println(p.privateVar);
    }
}
