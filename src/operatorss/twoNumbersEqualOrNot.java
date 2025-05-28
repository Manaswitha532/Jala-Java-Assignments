package operatorss;
import java.util.Scanner;
//Write a program to find the two numbers equal or not.
public class twoNumbersEqualOrNot {
	void equalOrNot(int a,int b) {
		if(a==b) {
			System.out.println("Yes Both numbers are Equal");
		}
		else {
			System.out.println("Both are not equal");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a : ");
		int a=sc.nextInt();
		System.out.println("Enter value of b: ");
		int b=sc.nextInt();
		twoNumbersEqualOrNot obj=new twoNumbersEqualOrNot();
		obj.equalOrNot(a,b);
	}

}
