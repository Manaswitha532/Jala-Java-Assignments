package interfacess;
//6. Create an interface with a default method and implement it in a class. Do not provide
//implementation to the default method and call the method.


//Interface with a default method
interface MyInterface {
 default void greet() {
     System.out.println("Hello from the default method in MyInterface!");
 }
}

//Class implementing the interface without overriding the default method
class MyClasss implements MyInterface {
 // No need to implement 'greet()' here
}

//Main class to test
public class DefaultMethod {
 public static void main(String[] args) {
     MyClasss obj = new MyClasss();
     obj.greet();  // Calls the default method from interface
 }
}
