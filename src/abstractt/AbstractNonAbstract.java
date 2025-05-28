package abstractt;
//2. Create a sub class for an abstract class. Create an object in the child class for the
//abstract class and access the non-abstract methods


//Abstract class
abstract class Animal {

 // Abstract method (must be implemented by subclass)
 abstract void makeSound();

 // Non-abstract method (can be directly used by subclass)
 void eat() {
     System.out.println("This animal eats food.");
 }
}
//Subclass
class Dog extends Animal {

 // Implementing the abstract method
 @Override
 void makeSound() {
     System.out.println("Dog barks: Woof Woof");
 }
}

public class AbstractNonAbstract {
	public static void main(String[] args) {
        // Create object of child class
        Dog myDog = new Dog();

        // Access non-abstract method from abstract class
        myDog.eat();         // Output: This animal eats food.

        // Access implemented abstract method
        myDog.makeSound();   // Output: Dog barks: Woof Woof
    }
}
