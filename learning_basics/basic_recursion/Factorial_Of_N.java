package learning_basics.basic_recursion;

class Factorial_Of_N_methods{
    public static int Factorial_Of_N_method1(int n){
        // base case
        if(n == 1){
            return 1;
        }
        int temp = Factorial_Of_N_method1(n - 1);
        return temp * n;
    }
}

public class Factorial_Of_N {
    public static void main(String[] args) {
        System.out.println(Factorial_Of_N_methods.Factorial_Of_N_method1(10));
    }
}
