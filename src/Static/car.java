package Static;
//4. Call instance methods in static methods

public class car {
	    // Instance method
	    public void startEngine() {
	        System.out.println("Engine Started");
	    }

	    // Static method
	    public static void drive() {
	        // Create object to call instance method
	        car c = new car();
	        c.startEngine();  // Calling instance method
	        System.out.println("Car is now driving...");
	    }
	    // Main method
	    public static void main(String[] args) {
	        drive();  // Call static method
	    }
}
