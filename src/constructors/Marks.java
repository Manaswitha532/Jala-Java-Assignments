package constructors;
class Display {

    // Method with 1 int parameter
    void show(int a) {
        System.out.println("Integer value: " + a);
    }

    // Method with 2 parameters: String and double
    void show(String msg, double value) {
        System.out.println("Message: " + msg + ", Value: " + value);
    }
}
public class Marks {
    public static void main(String[] args) {
        Display d = new Display();

        d.show(100);                  // Calls method with int
        d.show("Total Marks", 92.5);  // Calls method with String and double
    }
}