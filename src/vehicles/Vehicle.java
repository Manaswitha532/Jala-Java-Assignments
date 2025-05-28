package vehicles;
/*3. Create a class with PROTECTED fields and methods. Access these fields and methods
from any other class in the same package.
Also, Access the PROTECTED fields and methods from child class located in a different
package
Access the PROTECTED fields and methods from any class in different package*/




public class Vehicle {
    protected String type = "Car";
    protected int speed = 100;

    protected void showDetails() {
        System.out.println("Type: " + type);
        System.out.println("Speed: " + speed + " km/h");
    }
}


/*
✅ Revision Note: protected access modifier with multiple packages

→ 'Vehicle' class is in package 'vehicles' with protected fields and methods.
→ 'ServiceStation' (same package): Can access protected members ✅
→ 'Bike' (subclass in different package 'garage'): Can access protected members ✅
→ 'Mechanic' (non-subclass in different package): Cannot access protected members ❌

*/