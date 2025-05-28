package vehicles;

public class ServiceStation {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println("Accessing from same package:");
        System.out.println("Type: " + v.type);
        System.out.println("Speed: " + v.speed);
        v.showDetails();
    }
}


/*
✅ Revision Note: protected access modifier with multiple packages

→ 'Vehicle' class is in package 'vehicles' with protected fields and methods.
→ 'ServiceStation' (same package): Can access protected members ✅
→ 'Bike' (subclass in different package 'garage'): Can access protected members ✅
→ 'Mechanic' (non-subclass in different package): Cannot access protected members ❌

*/