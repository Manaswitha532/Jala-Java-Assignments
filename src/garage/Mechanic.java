package garage;
import vehicles.Vehicle;

public class Mechanic {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();

        // The following lines will show error ❌
        // System.out.println(v.type);        
        // System.out.println(v.speed);       
        // v.showDetails();

        System.out.println("Cannot access protected members from non-subclass in different package.");
    }
}


/*
✅ Revision Note: protected access modifier with multiple packages

→ 'Vehicle' class is in package 'vehicles' with protected fields and methods.
→ 'ServiceStation' (same package): Can access protected members ✅
→ 'Bike' (subclass in different package 'garage'): Can access protected members ✅
→ 'Mechanic' (non-subclass in different package): Cannot access protected members ❌

*/