package Arrays;
// Method to remove duplicates without using predefined functions

public class RemoveDuplicates {
	    public static int[] removeDuplicates(int[] arr) {
	        int n = arr.length;
	        int[] temp = new int[n];
	        int index = 0;

	        for (int i = 0; i < n; i++) {
	            boolean isDuplicate = false;

	            // Check if arr[i] is already in temp
	            for (int j = 0; j < index; j++) {
	                if (arr[i] == temp[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            // If not duplicate, add to temp
	            if (!isDuplicate) {
	                temp[index] = arr[i];
	                index++;
	            }
	        }

	        // Create result array of size index
	        int[] result = new int[index];
	        for (int i = 0; i < index; i++) {
	            result[i] = temp[i];
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 20, 10, 40, 50, 30};

	        int[] unique = removeDuplicates(numbers);

	        System.out.print("Array after removing duplicates: ");
	        for (int num : unique) {
	            System.out.print(num + " ");
	        }
	    }
	}


