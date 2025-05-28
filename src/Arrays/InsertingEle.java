package Arrays;
//Since Java arrays have fixed size, we can't directly insert into the same array — instead, we need to create a new array with size +1, and then insert the new element at the specified position.
public class InsertingEle {
	    // Function to insert an element at a given position
	    public static int[] insertElement(int[] arr, int element, int position) {
	        if (position < 0 || position > arr.length) {
	            System.out.println("Invalid position!");
	            return arr;
	        }
	        int[] newArr = new int[arr.length + 1];
	        for (int i = 0, j = 0; i < newArr.length; i++) {
	            if (i == position) {
	                newArr[i] = element;  // insert element at given position
	            } else {
	                newArr[i] = arr[j++]; // copy from original array
	            }
	        }
	        return newArr;
	    }
	    public static void main(String[] args) {
	        int[] original = {10, 20, 30, 40, 50};
	        int elementToInsert = 25;
	        int position = 2; // Insert at index 2 (between 20 and 30)
	        int[] result = insertElement(original, elementToInsert, position);
	        System.out.print("Array after insertion: ");
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	    }
	}



		
	
