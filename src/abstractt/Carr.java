package abstractt;
abstract class Vehiclee {

    // Non-abstract method
    void fuelType() {
        System.out.println("This vehicle uses petrol.");
    }
}
public class Carr extends Vehiclee {

    // Method inside child class to create instance and call non-abstract method
    void showFuelType() {
        // Creating an instance of child class
        Carr myCar = new Carr();

        // Calling non-abstract method from abstract superclass
        myCar.fuelType();
    }

    public static void main(String[] args) {
        // Calling the method
        Carr carObj = new Carr();
        carObj.showFuelType();  // Output: This vehicle uses petrol.
    }
}


