package Static;
//4. Call instance methods in static methods

public class Person {
	
	    // Instance method 1
	    public void sayHello() {
	        System.out.println("Hello! I am an instance method.");
	    }

	    // Instance method 2
	    public void showName(String name) {
	        System.out.println("My name is " + name);
	    }

	    // Static method
	    public static void performActions() {
	        // Create object to call instance methods
	        Person p = new Person();
	        p.sayHello();            // Calling instance method 1
	        p.showName("Manaswitha"); // Calling instance method 2
	    }

	    // Main method
	    public static void main(String[] args) {
	        performActions();  // Calling static method
	    }
	}


