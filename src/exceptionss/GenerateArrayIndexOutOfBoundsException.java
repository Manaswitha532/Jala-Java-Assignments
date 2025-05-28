package exceptionss;
//9. Write a program to generate ArrayIndexOutOfBoundException


public class GenerateArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        // Accessing index 5 which does not exist will throw ArrayIndexOutOfBoundsException
        int invalidIndexValue = numbers[5];

        System.out.println("Value at index 5: " + invalidIndexValue);
    }
}

