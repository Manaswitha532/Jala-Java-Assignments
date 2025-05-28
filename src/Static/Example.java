package Static;
//7. Call static methods and instance methods in main method
public class Example {
    // Static method
	    public static void displayCollege() {
	        System.out.println("This is a static method: ABC College");
	    }

	    // Instance method
	    public void showStudentDetails(String name, int rollNo) {
	        System.out.println("This is an instance method:");
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNo);
	    }

	    // Main method
	    public static void main(String[] args) {
	        // Calling static method directly
	        displayCollege();

	        // Creating object to call instance method
	        Example obj = new Example();
	        obj.showStudentDetails("Manaswitha", 101);
	    }
}
