package exceptionss;
//6. Write a program to create your own exception

//Custom exception class
class MyCustomException extends Exception {
 public MyCustomException(String message) {
     super(message);  // Pass the custom message to the Exception class
 }
}
public class CustomExceptionDemo {

    // Method that throws your custom exception
    public static void validateNumber(int number) throws MyCustomException {
        if (number < 1 || number > 100) {
            throw new MyCustomException("Number " + number + " is out of valid range (1-100).");
        } else {
            System.out.println("Number " + number + " is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateNumber(150);  // This will throw MyCustomException
        } catch (MyCustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        System.out.println("Program continues after custom exception handling.");
    }
}