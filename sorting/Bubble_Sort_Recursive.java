package sorting;

public class Bubble_Sort_Recursive {

    public void bubbleSort_Recursive(int[] arr, int n) {
        if (n == 1) {
            return;
        }

        boolean didSwap = false;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                didSwap = true;
            }
        }

        if (!didSwap) {
            return;
        }

        bubbleSort_Recursive(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        System.out.println("Before Using Bubble Sort:");
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();

        Bubble_Sort_Recursive obj = new Bubble_Sort_Recursive();
        obj.bubbleSort_Recursive(arr, n);

        System.out.println("After Using Bubble Sort:");
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }
}
