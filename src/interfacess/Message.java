package interfacess;
// 10. Create an interface with private, public and protected fields.

interface Interface {  
    int X = 10;
    int Y = 20;
    int Z = 30;

    void displayValues();

    default void showMessage() {
        System.out.println("Inside default method");
        printPrivateMessage();
    }

    private void printPrivateMessage() {
        System.out.println("Hello from private method inside interface");
    }
}

class Class implements Interface {
    public void displayValues() {
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
        System.out.println("Z = " + Z);
    }
}

public class Message {  // only this is public, file must be Main.java
    public static void main(String[] args) {
        Class obj = new Class();
        obj.displayValues();
        obj.showMessage();
    }
}




