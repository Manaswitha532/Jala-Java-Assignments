package Arrays;
//6. Write a function to copy an array to another array
public class CopyingElements {
	public static int[] copyElements(int arr1[]) {
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		return arr2;
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int result[]=copyElements(arr);
		System.out.print("Copied Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
}
