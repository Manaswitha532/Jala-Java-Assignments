package interfacess;
//Parent Interface
interface Animal {
 void eat();
}

//Child Interface inheriting from Animal
interface Dog extends Animal {
 void bark();
}

//Class implementing the child interface
class MyDog implements Dog {
 public void eat() {
     System.out.println("Dog is eating.");
 }

 public void bark() {
     System.out.println("Dog is barking.");
 }
}

//Main class to test
public class Inheriting {
 public static void main(String[] args) {
     MyDog obj = new MyDog();
     obj.eat();   // Inherited from Animal interface
     obj.bark();  // Defined in Dog interface
 }
}

