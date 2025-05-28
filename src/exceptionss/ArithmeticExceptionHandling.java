package exceptionss;
//2. Handle the Arithmetic exception using try-catch block

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        }
    }
}
