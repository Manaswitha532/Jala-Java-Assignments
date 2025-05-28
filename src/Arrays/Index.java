package Arrays;
//3. Write a program to find the index of an array element
import java.util.Scanner;
public class Index {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("the elements of the array are: ");
		int a[]= {10,15,2,9,60};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter element which you want index of: ");
		int ele=sc.nextInt();
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				System.out.println("Index of the element "+ele+" is "+ i);
				found=true;
			}	
		}
		if(found==false) {
			System.out.println("Didn't find the element in the array..");
		}
	}

}
