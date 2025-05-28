package loops;
//5. Write a program to print largest number among three numbers.
public class largestOfThree {

	public static void main(String[] args) {
		        int a = 25;
		        int b = 50;
		        int c = 40;

		        if (a >= b && a >= c) {
		            System.out.println("Largest number is: " + a);
		        } else if (b >= a && b >= c) {
		            System.out.println("Largest number is: " + b);
		        } else {
		            System.out.println("Largest number is: " + c);
		        }
		    }
}
