package constructors;
class constr {

    // Constructor - called only once when object is created
    constr() {
        System.out.println("Constructor called");
        init();  // optional: runs once during object creation
    }

    // Method to simulate constructor logic
    void init() {
        System.out.println("Initialized logic");
    }
}

public class Demo{
    public static void main(String[] args) {
        constr d = new constr();   // Constructor runs once

        // Manually call the init() method multiple times
        d.init();              // Call 1
        d.init();              // Call 2
    }
}


