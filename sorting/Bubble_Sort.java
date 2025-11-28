package sorting;
import java.util.Arrays;

public class Bubble_Sort { // Time Complexity = O(n^2) best = O(n) (when array is already sorted)

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Flag to optimize: if no swaps occur in a pass, array is sorted
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array: " + Arrays.toString(data));

        bubbleSort(data); 

        System.out.println("Sorted Array: " + Arrays.toString(data));
    }
}