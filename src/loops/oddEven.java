package loops;
//4. Write a program to print the odd and even numbers
public class oddEven {

	public static void main(String[] args) {
		System.out.println("Even numbers are: ");
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\nOdd numbers are: ");
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		}
		
	}

}
