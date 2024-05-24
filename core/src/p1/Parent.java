package p1;
 public class Parent {

    public String publicVar       = "1 publicVar"; // accessible everywhere
    String defaultVar             = "2 defaultVar"; // within same package
    protected String protectedVar = "3 protectedVar"; // in derived classes across packages
    private String privateVar     = "4 privateVar"; //only accessible in the same class
 
}
 