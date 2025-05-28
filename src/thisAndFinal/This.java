package thisAndFinal;
//1. Print the fields/instance members of the current class using this and without using object

public class This {
	
	    int id = 101;
	    String name = "Manaswitha";

	    void displayDetails() {
	        System.out.println("ID: " + this.id);
	        System.out.println("Name: " + this.name);
	    }

	    public static void main(String[] args) {
	        // Creating object to call non-static method
	    	This obj = new This();
	        obj.displayDetails(); // this is used inside displayDetails method
	    }
	}
