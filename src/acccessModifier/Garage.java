package acccessModifier;
/*2. Create a class with DEFAULT fields and methods. Access these fields and methods
from any other class in the same package*/


	// Same package, so it can access Car's default fields/methods
	public class Garage {
	    public static void main(String[] args) {
	        Car myCar = new Car();
	        System.out.println("Accessing default fields from another class in same package:");
	        System.out.println("Brand: " + myCar.brand);   // ✅ OK
	        System.out.println("Speed: " + myCar.speed);   // ✅ OK
	        myCar.displayInfo();                           // ✅ OK
	    }
}
