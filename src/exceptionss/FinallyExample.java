package exceptionss;
//7. Write a program with finally block

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            // This will throw ArithmeticException
            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero.");
        } finally {
            System.out.println("Finally block executed: This always runs whether exception occurs or not.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
