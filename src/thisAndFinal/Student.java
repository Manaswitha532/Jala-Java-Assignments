package thisAndFinal;
//3. Call constructor of the current class using this()

public class Student {
	    int id;
	    String name;

	    // Constructor 1: No-arg constructor
	    Student() {
	        this(101, "Manaswitha"); // calling Constructor 2
	        System.out.println("No-arg constructor called");
	    }

	    // Constructor 2: Parameterized constructor
	    Student(int id, String name) {
	        this.id = id;
	        this.name = name;
	        System.out.println("Parameterized constructor called");
	        System.out.println("ID: " + this.id);
	        System.out.println("Name: " + this.name);
	    }

	    public static void main(String[] args) {
	        Student s = new Student(); // This will call the no-arg constructor
	    }
	}

