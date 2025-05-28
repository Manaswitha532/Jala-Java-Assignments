package interfacess;
//2. Create an interface with two methods, but implement only one in a class. Call the method implemented.

interface Operations {
    void add();       // abstract method 1
    void subtract();  // abstract method 2
}
abstract class Calculator implements Operations {

    // Implementing only one method
    @Override
    public void add() {
        System.out.println("Performing addition.");
    }

    // subtract() is not implemented, so this class must be abstract
}
public class SimpleCalculator extends Calculator {

    // Implementing the remaining method
    @Override
    public void subtract() {
        System.out.println("Performing subtraction.");
    }

    public static void main(String[] args) {
        // Create object of the subclass
        SimpleCalculator calc = new SimpleCalculator();

        // Call the method that was implemented in the abstract class
        calc.add();         // Output: Performing addition.

        // Optional: call the second method
        // calc.subtract(); // Output: Performing subtraction.
    }
}

