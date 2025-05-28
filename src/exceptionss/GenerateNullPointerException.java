package exceptionss;
//15. Write a program to generate NullPointerException

public class GenerateNullPointerException {
    public static void main(String[] args) {
        String str = null;

        // This will throw NullPointerException because str is null
        int length = str.length();

        System.out.println("Length of string: " + length);
    }
}
