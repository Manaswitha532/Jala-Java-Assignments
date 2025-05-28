package methodOverLoading;
//please give me different class names instead of Main becozz it is already there in my package

class OverloadExample {

    // Method with one parameter of type int
    void display(int number) {
        System.out.println("Displaying int: " + number);
    }

    // Method with two parameters: one String and one double
    void display(String text, double value) {
        System.out.println("Displaying String and double: " + text + ", " + value);
    }
}
public class TestOverload {
    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();

        obj.display(42);                    // Calls method with int
        obj.display("Price", 99.99);        // Calls method with String and double
    }
}

