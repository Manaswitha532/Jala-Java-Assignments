package Static;
//3. Print static variables in Instance methods

public class Student2 {

	    // Static variables
	    static String college = "ABC College";
	    static int totalStudents = 0;

	    // Instance method
	    public void showCollegeDetails() {
	        System.out.println("College Name: " + college);
	        System.out.println("Total Students: " + totalStudents);
	    }

	    // Main method
	    public static void main(String[] args) {
	        // Increment static variable
	        totalStudents = 100;

	        // Create object and call instance method
	        Student2 s1 = new Student2();
	        s1.showCollegeDetails();
	    }

}
