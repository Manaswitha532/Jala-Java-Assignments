package Arrays;
//16. Write a function to get the difference of largest and smallest value

public class Difference {
	    public static int differenceLargestSmallest(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            throw new IllegalArgumentException("Array must not be empty");
	        }

	        int largest = arr[0];
	        int smallest = arr[0];

	        for (int num : arr) {
	            if (num > largest) {
	                largest = num;
	            }
	            if (num < smallest) {
	                smallest = num;
	            }
	        }

	        return largest - smallest;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 5, 20, 15, 3};

	        int diff = differenceLargestSmallest(numbers);
	        System.out.println("Difference between largest and smallest: " + diff);
	    }
	}

