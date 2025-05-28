package Static;
//1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
//methods and a main method.

public class DemoStatic {

	    // Static variables (shared by all objects)
	    static String companyName = "TechCorp";
	    static int totalEmployees = 0;

	    // Instance variables (unique for each object)
	    String employeeName;
	    int employeeId;

	    // Constructor to initialize instance variables
	    public DemoStatic(String name, int id) {
	        this.employeeName = name;
	        this.employeeId = id;
	        totalEmployees++;  // increment count when new object is created
	    }

	    // Static method 1
	    public static void displayCompanyName() {
	        System.out.println("Company: " + companyName);
	    }

	    // Static method 2
	    public static void displayTotalEmployees() {
	        System.out.println("Total Employees: " + totalEmployees);
	    }

	    // Instance method 1
	    public void showEmployeeDetails() {
	        System.out.println("Employee Name: " + employeeName);
	        System.out.println("Employee ID: " + employeeId);
	    }

	    // Instance method 2
	    public void greetEmployee() {
	        System.out.println("Hello, " + employeeName + "! Welcome to " + companyName);
	    }

	    // Main method
	    public static void main(String[] args) {
	        // Call static methods directly
	        displayCompanyName();

	        // Create two objects
	        DemoStatic emp1 = new DemoStatic("Alice", 101);
	        DemoStatic emp2 = new DemoStatic("Bob", 102);

	        // Call instance methods
	        emp1.showEmployeeDetails();
	        emp1.greetEmployee();

	        emp2.showEmployeeDetails();
	        emp2.greetEmployee();

	        // Call static method again to show total employees
	        displayTotalEmployees();
	    }
	}

