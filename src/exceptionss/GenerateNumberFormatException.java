package exceptionss;
//16. Write a program to generate NumberFormatException

public class GenerateNumberFormatException {
    public static void main(String[] args) {
        String invalidNumber = "abc123";

        // This will throw NumberFormatException because the string is not a valid number
        int number = Integer.parseInt(invalidNumber);

        System.out.println("Parsed number: " + number);
    }
}


