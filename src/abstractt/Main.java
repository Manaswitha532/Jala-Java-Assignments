package abstractt;
//1. Create an abstract class with abstract and non-abstract methods.


//Abstract class
abstract class Vehicle {

 // Abstract method
 abstract void startEngine();

 // Non-abstract method
 void fuelType() {
     System.out.println("This vehicle uses diesel.");
 }
}
class Car extends Vehicle {

    // Providing implementation for abstract method
    @Override
    void startEngine() {
        System.out.println("Car engine started with key ignition.");
    }
}
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();  // Output: Car engine started with key ignition.
        myCar.fuelType();     // Output: This vehicle uses diesel.
    }
}

