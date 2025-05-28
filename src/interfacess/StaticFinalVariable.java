package interfacess;
//11. Create an interface with static final variable
interface DemoInterface {
    // static final variable (constant)
    static final int CONSTANT_VALUE = 100;
    
    void displayValue();
}

class DemoClass implements DemoInterface {
    public void displayValue() {
        // Access the interface's static final variable
        System.out.println("Constant value is: " + CONSTANT_VALUE);
    }
}

public class StaticFinalVariable {
    public static void main(String[] args) {
        DemoClass obj = new DemoClass();
        obj.displayValue();
        
        // You can also access the constant directly from the interface
        System.out.println("Accessing constant directly: " + DemoInterface.CONSTANT_VALUE);
    }
}