package Arrays;
// Function to print duplicate values in the array
public class FindDuplicates {
	    public static void findDuplicates(int[] arr) {
	        boolean foundDuplicate = false;
	        System.out.println("Duplicate elements are:");
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.println(arr[i]);
	                    foundDuplicate = true;
	                    break; // To avoid printing the same duplicate multiple times
	                }
	            }
	        }
	        if (!foundDuplicate) {
	            System.out.println("No duplicates found.");
	        }
	    }
	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 20, 40, 10, 50};
	        findDuplicates(numbers);
	    }
	}


