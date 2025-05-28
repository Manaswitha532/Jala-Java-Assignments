package interfacess;
//5. Create two interfaces with the same method (same signature) in both the interfaces.
//Implement these two interfaces in one class. Call the method.

//Interface 1
interface InterfaceA {
 void showMessage();
}

//Interface 2
interface InterfaceB {
 void showMessage();
}

//Implementing both interfaces
class MyClass implements InterfaceA, InterfaceB {
 // Single implementation of the common method
 public void showMessage() {
     System.out.println("Hello from MyClass!");
 }
}

//Main class to test
public class SameMethod {
 public static void main(String[] args) {
     MyClass obj = new MyClass();
     obj.showMessage();  // Calling the method
 }
}
