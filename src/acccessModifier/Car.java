package acccessModifier;
/*2. Create a class with DEFAULT fields and methods. Access these fields and methods
from any other class in the same package*/


	// No public/private/protected modifier → default access
	class Car {
	    String brand = "Honda";       // default field
	    int speed = 120;              // default field

	    void displayInfo() {          // default method
	        System.out.println("Brand: " + brand);
	        System.out.println("Speed: " + speed + " km/h");
	    }
	}

