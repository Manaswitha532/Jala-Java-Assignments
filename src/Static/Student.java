package Static;
//6. Print all the static, instance variables in main method

public class Student {
	
	    // Static variables
	    static String college = "Vaagdevi College";
	    static int year = 2025;

	    // Instance variables
	    String name;
	    int rollNumber;

	    // Constructor to initialize instance variables
	    public Student(String name, int rollNumber) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	    }

	    // Main method
	    public static void main(String[] args) {
	        // Printing static variables directly
	        System.out.println("College: " + college);
	        System.out.println("Year: " + year);

	        // Create object to access instance variables
	        Student s1 = new Student("Manaswitha", 532);
	        
	        // Print instance variables using object
	        System.out.println("Name: " + s1.name);
	        System.out.println("Roll Number: " + s1.rollNumber);
	    }
}
