package p1;
public class AccessModifierDemo{
   // instance variables
    public String publicVar       = "1 publicVar";
    String defaultVar             = "2 defaultVar";
    protected String protectedVar = "3 protectedVar";
    private String privateVar     = "4 privateVar";
    


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        AccessModifierDemo p = new AccessModifierDemo();
        System.out.println(p.publicVar);
        System.out.println(p.defaultVar);
        System.out.println(p.protectedVar);
        System.out.println(p.privateVar);
    }
}
