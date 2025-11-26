package learning_basics.basic_maths;
import java.util.ArrayList;
import java.util.Collections;

class Print_Divisors_methods{
    public static void Print_Divisors_Method1(int num){ // Time Complexity = O(n)
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i + " ");
            }
        }
    }

    public static void Print_Divisors_Method2(int num){
        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                System.out.print(i + " ");
                if((num / i) != i){
                    System.out.print((num / i) + " ");
                }
            }
        }
    }

    public static void Print_Divisors_Method2_Sorted(int num){
        ArrayList<Integer> a = new ArrayList<>();
        // loop takes O(sqrt(n))
        for(int i = 1; i <= i*i; i++){ // use i*i instead of Math.sqrt because every function call takes time
            if(num % i == 0){
                a.add(i);
                if((num / i) != i){
                    a.add(num / i);
                }
            }
        }
        // Sorting takes O(n log n) n is the number of factors
        Collections.sort(a);
        // Printing takes O(n) n is number of factors 
        System.out.print(a + " ");
    }
}

public class Print_Divisors {
    public static void main(String[] args) {
        Print_Divisors_methods.Print_Divisors_Method1(36);
        Print_Divisors_methods.Print_Divisors_Method2(36);
        Print_Divisors_methods.Print_Divisors_Method2_Sorted(36);
    }
}
