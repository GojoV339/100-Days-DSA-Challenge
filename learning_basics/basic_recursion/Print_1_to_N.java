package learning_basics.basic_recursion;

class Print_1_to_N_methods{
    public static void Print_1_to_N_method1(int n){
        if(n == 0){
            return;
        }
        Print_1_to_N_method1(n - 1);
        System.out.print(n);
    }
}

class Print_N_to_1_methods{
    public static void Print_N_to_1_method1(int n){
        if(n == 0){
            return;
        }
        System.out.print(n);
        Print_N_to_1_method1(n - 1);

    }
}

public class Print_1_to_N {
    public static void main(String[] args){
        Print_1_to_N_methods.Print_1_to_N_method1(10);
        Print_N_to_1_methods.Print_N_to_1_method1(10);
    }
}
