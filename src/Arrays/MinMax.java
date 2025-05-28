package Arrays;
//Function to find min and max values in an array
public class MinMax{
public static void findMinMax(int[] arr) {
    if (arr == null || arr.length == 0) {
        System.out.println("Array is empty.");
        return;
    }

    int min = arr[0];
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        } else if (arr[i] > max) {
            max = arr[i];
        }
    }

    System.out.println("Minimum value: " + min);
    System.out.println("Maximum value: " + max);
}

public static void main(String[] args) {
    int[] numbers = {25, 7, 89, 14, 3, 55, 99};
    findMinMax(numbers);
}
}
