package exceptionss;
//17. Write a program to generate StringIndexOutOfBoundsException


public class GenerateStringIndexOutOfBoundsException {
    public static void main(String[] args) {
        String str = "Hello";

        // Accessing character at index 10 which does not exist will throw StringIndexOutOfBoundsException
        char ch = str.charAt(10);

        System.out.println("Character at index 10: " + ch);
    }
}
