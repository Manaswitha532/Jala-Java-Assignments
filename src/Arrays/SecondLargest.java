package Arrays;
//13. Write a method to find the second largest number in an array
public class SecondLargest {
	    public static int findSecondLargest(int[] arr) {
	        if (arr == null || arr.length < 2) {
	            throw new IllegalArgumentException("Array must have at least two elements");
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num < largest) {
	                secondLargest = num;
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            throw new RuntimeException("No second largest element found (all elements might be equal)");
	        }

	        return secondLargest;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 40, 30, 50, 20, 50};

	        int secondLargest = findSecondLargest(numbers);
	        System.out.println("Second largest number is: " + secondLargest);
	    }
	
}
