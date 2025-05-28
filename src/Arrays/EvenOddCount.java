package Arrays;
//15. Write a method to find number of even number and odd numbers in an array

public class EvenOddCount {
		public static void countEvenOdd(int[] arr) {
	        int evenCount = 0;
	        int oddCount = 0;

	        for (int num : arr) {
	            if (num % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }

	        System.out.println("Number of even numbers: " + evenCount);
	        System.out.println("Number of odd numbers: " + oddCount);
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 15, 20, 25, 30, 35, 40};

	        countEvenOdd(numbers);
	    }
	}

