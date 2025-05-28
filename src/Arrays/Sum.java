package Arrays;
//1. Write a function to add integer values of an array

public class Sum {

	    // Function to add integer values of an array
	    public static int sumArray(int[] numbers) {
	        int sum = 0;
	        for (int num : numbers) {
	            sum += num;
	        }
	        return sum;
	    }

	    // Main method to test the function
	    public static void main(String[] args) {
	        int[] myArray = {10, 20, 30, 40, 50};
	        int result = sumArray(myArray);
	        System.out.println("Sum of array elements: " + result);
	    }
	}

