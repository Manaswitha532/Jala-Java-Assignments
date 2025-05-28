package garage;
import vehicles.Vehicle;

public class Bike extends Vehicle {
    public void accessProtected() {
        System.out.println("Accessing from subclass in different package:");
        System.out.println("Type: " + type);    // OK (inherited)
        System.out.println("Speed: " + speed);  // OK
        showDetails();                          // OK
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.accessProtected();
    }
}


/*
✅ Revision Note: protected access modifier with multiple packages

→ 'Vehicle' class is in package 'vehicles' with protected fields and methods.
→ 'ServiceStation' (same package): Can access protected members ✅
→ 'Bike' (subclass in different package 'garage'): Can access protected members ✅
→ 'Mechanic' (non-subclass in different package): Cannot access protected members ❌

*/