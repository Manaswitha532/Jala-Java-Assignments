package Arrays;
// Function to print common elements between two arrays

public class CommonElements {

	    public static void findCommonElements(int[] arr1, int[] arr2) {
	        System.out.println("Common elements are:");

	        for (int i = 0; i < arr1.length; i++) {
	            for (int j = 0; j < arr2.length; j++) {
	                if (arr1[i] == arr2[j]) {
	                    System.out.println(arr1[i]);
	                    break; // Avoid printing duplicates from arr2
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] array1 = {10, 20, 30, 40, 50};
	        int[] array2 = {15, 20, 30, 60, 70};

	        findCommonElements(array1, array2);
	    }
	}


