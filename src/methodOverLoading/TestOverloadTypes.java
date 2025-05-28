package methodOverLoading;
//4. Write two methods with the same name and same number of parameters of different type and call from main method

class ExampleOverload {

    // Method with one int parameter
    void display(int num) {
        System.out.println("Integer value: " + num);
    }

    // Method with one String parameter
    void display(String text) {
        System.out.println("String value: " + text);
    }
}
public class TestOverloadTypes {
    public static void main(String[] args) {
        ExampleOverload obj = new ExampleOverload();

        obj.display(50);             // Calls display(int)
        obj.display("Manaswitha");   // Calls display(String)
    }
}
