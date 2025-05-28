package exceptionss;

//3. Write a method which throws exception, Call that method in main class without try block

public class ThrowExceptionExample {

    // Method that declares it throws an Exception
    public static void riskyMethod() throws Exception {
        // Explicitly throw an Exception
        throw new Exception("Something went wrong in riskyMethod!");
    }

    public static void main(String[] args) throws Exception {
        // Call the method without try-catch, main declares throws Exception
        riskyMethod();
        System.out.println("This line will not execute because exception is thrown above.");
    }
}
