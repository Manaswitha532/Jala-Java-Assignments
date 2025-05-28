package Arrays;
//19. Write a function to find the missing number of sorted array of 1 to 100
public class FindMissingNumber {
	    public static int findMissing(int[] arr) {
	        int n = 100;
	        int expectedSum = n * (n + 1) / 2;  // Sum of numbers from 1 to 100
	        int actualSum = 0;

	        for (int num : arr) {
	            actualSum += num;
	        }

	        return expectedSum - actualSum;
	    }

	    public static void main(String[] args) {
	        // Example array from 1 to 100, missing 57
	        int[] arr = new int[99];
	        int index = 0;
	        for (int i = 1; i <= 100; i++) {
	            if (i != 57) {  // Suppose 57 is missing
	                arr[index++] = i;
	            }
	        }

	        int missing = findMissing(arr);
	        System.out.println("Missing number is: " + missing);
	    }
}
