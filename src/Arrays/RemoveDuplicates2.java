package Arrays;
//18. Write a program to remove the duplicate elements and return the new array

public class RemoveDuplicates2 {
	
	    public static int[] removeDuplicates(int[] arr) {
	        int n = arr.length;
	        int[] temp = new int[n]; // Temporary array to store unique elements
	        int uniqueCount = 0;

	        for (int i = 0; i < n; i++) {
	            boolean isDuplicate = false;

	            // Check if arr[i] already exists in temp
	            for (int j = 0; j < uniqueCount; j++) {
	                if (arr[i] == temp[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            // If not duplicate, add to temp
	            if (!isDuplicate) {
	                temp[uniqueCount] = arr[i];
	                uniqueCount++;
	            }
	        }

	        // Create new array with exact size
	        int[] result = new int[uniqueCount];
	        for (int i = 0; i < uniqueCount; i++) {
	            result[i] = temp[i];
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] arr = {10, 20, 10, 30, 40, 20, 50};

	        int[] newArr = removeDuplicates(arr);

	        System.out.print("Array after removing duplicates: ");
	        for (int val : newArr) {
	            System.out.print(val + " ");
	        }
	    }
}
