package loops;
//9. Write a program to find the prime or not.
import java.util.Scanner;

public class prime {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int number = sc.nextInt();
		        boolean isPrime = true;

		        // 0 and 1 are not prime numbers
		        if (number <= 1) {
		            isPrime = false;
		        } else {
		            // Check from 2 to number - 1
		            for (int i = 2; i < number; i++) {
		                if (number % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		        }

		        // Print result
		        if (isPrime) {
		            System.out.println(number + " is a Prime number.");
		        } else {
		            System.out.println(number + " is NOT a Prime number.");
		        }

		        sc.close();
		    }
		}

	
