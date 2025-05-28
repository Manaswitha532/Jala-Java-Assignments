package Arrays;
//5. Write a function to remove a specific element from an array
public class removeElement {
	    //Java arrays have a fixed size, so to "remove" an element from an array, you typically create a new array without that element.
	    
	    public static int[] removeElement(int[] arr, int ele) {
	        int count = 0;

	        // Check how many times the element is not equal to ele
	        for (int num : arr) {
	            if (num != ele) {
	                count++;
	            }
	        }

	        // If all elements are same as ele, return empty array
	        int[] newArr = new int[count];
	        int index = 0;

	        for (int num : arr) {
	            if (num != ele) {
	                newArr[index++] = num;
	            }
	        }

	        return newArr;
	    }

	    public static void main(String[] args) {
	        int[] originalArray = {10, 20, 30, 40, 50, 30};
	        int elementToRemove = 30;

	        int[] result = removeElement(originalArray, elementToRemove);

	        System.out.print("Array after removing " + elementToRemove + ": ");
	        for (int num : result) {
	            System.out.print(num + " ");
	        }
	    }
	}

