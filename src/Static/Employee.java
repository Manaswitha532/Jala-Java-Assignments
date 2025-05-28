package Static;
//2. Print instance variables in static methods
public class Employee {
	    // Instance variables
	    String name = "Manaswitha";
	    int id = 101;

	    // Static method
	    public static void printInstanceVariables() {
	        // Create object to access instance variables
	        Employee e = new Employee();
	        System.out.println("Name: " + e.name);
	        System.out.println("ID: " + e.id);
	    }

	    // Main method
	    public static void main(String[] args) {
	        printInstanceVariables(); // Call static method
	    }
	}

