package sorting;

public class Selection_Sort{
    
    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr){
        for(int value : arr){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {1,5,6,2,45,73,86,92,99};

        System.out.println("Original Array");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted Array");
        printArray(arr);
    }
}