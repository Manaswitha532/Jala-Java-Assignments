package loops;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int number = sc.nextInt();

		        int temp = number;
		        int count = 0;

		        // Step 1: Find number of digits manually
		        while (temp > 0) {
		            temp = temp / 10;
		            count++;
		        }

		        temp = number;
		        int total = 0;

		        // Step 2: Calculate sum of digits raised to the power count
		        while (temp > 0) {
		            int digit = temp % 10;

		            // Calculate digit^count using loop (manual power calculation)
		            int power = 1;
		            for (int i = 1; i <= count; i++) {
		                power = power * digit;
		            }

		            total = total + power;
		            temp = temp / 10;
		        }

		        // Step 3: Check if total equals original number
		        if (total == number) {
		            System.out.println(number + " is an Armstrong number.");
		        } else {
		            System.out.println(number + " is not an Armstrong number.");
		        }

		        sc.close();
	}

}
