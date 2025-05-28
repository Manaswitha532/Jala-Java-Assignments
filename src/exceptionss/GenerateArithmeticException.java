package exceptionss;
//8. Write a program to generate Arithmetic Exception

public class GenerateArithmeticException {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        // This line will cause ArithmeticException: / by zero
        int result = numerator / denominator;

        System.out.println("Result: " + result);
    }
}

