package sorting;

public class Quick_Sort {

    public void quickSort(int[] arr,int low , int high){
        if(low < high){
            int pi = partition(arr,low,high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;

        for(int j = low + 1; j <= high; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void printArray(int[] arr){
        for(int value : arr){
            System.out.print(value + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        int[] arr = {30,20,50,10, 80, 60, 40, 70};

        System.out.println("Original Array");
        printArray(arr);

        Quick_Sort qs = new Quick_Sort();
        qs.quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array");
        printArray(arr);
    }
}
