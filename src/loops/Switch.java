package loops;
//11. Program to check whether a number is EVEN or ODD using switch
import java.util.Scanner;
public class Switch {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        int remainder = number % 2;

	        switch (remainder) {
	            case 0:
	                System.out.println(number + " is EVEN.");
	                break;
	            case 1:
	                System.out.println(number + " is ODD.");
	                break;
	            default:
	                System.out.println("Invalid input.");
	        }
	        sc.close();
	    }
	}
