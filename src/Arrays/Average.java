package Arrays;
//2. Write a function to calculate the average value of an array of integers
public class Average {
	public static float avg(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		float avg=(float)sum/arr.length;
		return avg;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println(avg(arr));
	}

}
