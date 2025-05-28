package Arrays;
//4. Write a function to test if array contains a specific value

public class CheckIfElementPresent {
	public static boolean ifPresent(int arr[],int ele) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,80};
		if(ifPresent(a,100)) {
			System.out.println("present");
		}
		else {
			System.out.println("Not present");
		}

	}

}
