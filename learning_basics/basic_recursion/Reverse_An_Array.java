package learning_basics.basic_recursion;

class Reverse_An_Array_methods{
    public static void Reverse_An_Array_method1(int[] arr, int start , int end){
        if(start >= end){
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        Reverse_An_Array_method1(arr, start + 1, end - 1);
    }
}

public class Reverse_An_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        Reverse_An_Array_methods.Reverse_An_Array_method1(arr, 0, arr.length - 1);


        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
