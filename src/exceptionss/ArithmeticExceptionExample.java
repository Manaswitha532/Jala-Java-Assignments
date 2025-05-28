package exceptionss;
//1. Write a program to generate Arithmetic Exception without exception handling

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // This line will throw ArithmeticException at runtime
        int result = a / b;

        System.out.println("Result: " + result);
    }
}
