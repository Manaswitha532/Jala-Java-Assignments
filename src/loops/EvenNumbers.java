package loops;
//6. Write a program to print even number between 10 and 100 using while
public class EvenNumbers {

	public static void main(String[] args) {
		int i=10;
		System.out.println("Even numbers from 10 to 100 are : ");
		while(i<=100) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
