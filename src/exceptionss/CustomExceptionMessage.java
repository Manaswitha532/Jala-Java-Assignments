package exceptionss;
//5. Write a program to throw exception with your own message

public class CustomExceptionMessage {
    public static void checkAge(int age) {
        if (age < 18) {
            // Throwing an ArithmeticException with a custom message
            throw new ArithmeticException("Age must be at least 18 to vote. Provided age: " + age);
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        // This will throw an exception with the custom message
        checkAge(15);
        
        // This line will not execute because exception is thrown above
        System.out.println("End of program.");
    }
}
