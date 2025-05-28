package interfacess;
//8. Create a PUBLIC interface with fields and methods, fields should have values assigned.Implement this interface to some class and print the values of the interface fields and
//call the interface methods


interface Vehicle {
 int MAX_SPEED = 120;
 String TYPE = "Four Wheeler";
 void displayDetails();
}

class Car implements Vehicle {
 public void displayDetails() {
     System.out.println("Vehicle Type: " + TYPE);
     System.out.println("Maximum Speed: " + MAX_SPEED + " km/h");
 }
}

public class publicInterface {
 public static void main(String[] args) {
     Car myCar = new Car();
     myCar.displayDetails();

     // Accessing static fields from the interface
     System.out.println("Accessing directly: " + Vehicle.TYPE);
     System.out.println("Accessing directly: " + Vehicle.MAX_SPEED);
 }
}



