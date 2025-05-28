package Arrays;
//17. Write a method to verify if the array contains two specified elements(12,23)

public class ContainsTwoElements {
	    public static boolean containsBoth(int[] arr, int ele1, int ele2) {
	        boolean foundEle1 = false;
	        boolean foundEle2 = false;

	        for (int num : arr) {
	            if (num == ele1) {
	                foundEle1 = true;
	            }
	            if (num == ele2) {
	                foundEle2 = true;
	            }
	            // If both found, no need to continue checking
	            if (foundEle1 && foundEle2) {
	                return true;
	            }
	        }

	        return false;  // One or both elements not found
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 12, 15, 23, 30};

	        boolean result = containsBoth(numbers, 12, 23);
	        if (result) {
	            System.out.println("Array contains both 12 and 23");
	        } else {
	            System.out.println("Array does not contain both 12 and 23");
	        }
	    }
}
