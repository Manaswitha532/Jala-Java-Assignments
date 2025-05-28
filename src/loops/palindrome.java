package loops;
//10. Write a program to palindrome or not
import java.util.Scanner;
public class palindrome {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        int originalNumber = number; // Save original number
	        int reversed = 0;

	        // Reverse the number using a loop
	        while (number > 0) {
	            int digit = number % 10;          // Get last digit
	            reversed = reversed * 10 + digit; // Add digit to reversed number
	            number = number / 10;             // Remove last digit
	        }

	        // Check if original number is equal to reversed number
	        if (originalNumber == reversed) {
	            System.out.println(originalNumber + " is a Palindrome.");
	        } else {
	            System.out.println(originalNumber + " is NOT a Palindrome.");
	        }

	        sc.close();
	    }
	}
