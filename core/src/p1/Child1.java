package p1;

public class Child1 {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Parent p = new Parent();
        System.out.println(p.publicVar);
        System.out.println(p.defaultVar);
        System.out.println(p.protectedVar);
       // System.out.println(p.privateVar);
    }
}
