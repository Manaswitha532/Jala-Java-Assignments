package methodOverLoading;
class Calci {

    // Method with 1 int parameter
    void add(int a) {
        System.out.println("Sum with 1 number: " + a);
    }

    // Method with 2 int parameters
    void add(int a, int b) {
        System.out.println("Sum with 2 numbers: " + (a + b));
    }
}
public class Calculatorr {
    public static void main(String[] args) {
        Calci calc = new Calci();

        calc.add(5);         // Calls method with 1 parameter
        calc.add(5, 10);     // Calls method with 2 parameters
    }
}

