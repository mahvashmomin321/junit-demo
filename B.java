package mypack;
import pack.A;
class B {  
    public static void main(String args[]) {  
        pack.A obj = new pack.A();  //using fully qualified name  
        obj.msg();  
	 System.out.println("Hello World");
    }  
}