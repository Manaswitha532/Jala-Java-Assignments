package Arrays;
//9. Write a function to reverse an array of integer values
public class Reverse {
	
	    public static void reverseArray(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;

	        while (start < end) {
	            // Swap arr[start] and arr[end]
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;

	            start++;
	            end--;
	        }
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50};

	        System.out.print("Original Array: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }

	        reverseArray(numbers);

	        System.out.print("\nReversed Array: ");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	    }
	
}
