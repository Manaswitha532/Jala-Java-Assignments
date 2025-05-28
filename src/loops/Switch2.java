package loops;
import java.util.Scanner;
public class Switch2 {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter gender (M/F): ");
	        char gender = scanner.next().toUpperCase().charAt(0); // Convert to uppercase to handle 'm'/'f'

	        switch (gender) {
	            case 'M':
	                System.out.println("Male");
	                break;
	            case 'F':
	                System.out.println("Female");
	                break;
	            default:
	                System.out.println("Invalid input");
	        }

	        scanner.close();
	    }
	}

