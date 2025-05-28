package thisAndFinal;
//4. Call argument constructor of current class using this()

public class Employee {
	    int empId;
	    String empName;

	    // Constructor 1: No-arg constructor
	    Employee() {
	        this(1001, "Manaswitha"); // calling parameterized constructor
	        System.out.println("No-arg constructor called");
	    }

	    // Constructor 2: Argument constructor
	    Employee(int id, String name) {
	        empId = id;
	        empName = name;
	        System.out.println("Parameterized constructor called");
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Employee Name: " + empName);
	    }

	    public static void main(String[] args) {
	        Employee e = new Employee(); // This triggers the no-arg constructor
	}

}
