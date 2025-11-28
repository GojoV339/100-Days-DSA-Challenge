package sorting;

import java.util.Arrays;

public class Insertion_Sort {

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i <= n - 1;i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {34,6,56,32,89,15,59,99};

        insertionSort(data);
        System.out.println("SortedArray : " + Arrays.toString(data));
    }
}
