package learning_basics.basic_recursion;


class Print_Name_N_times_methods{
    public static void Method1(String name, int n){
        if(n == 0){
            return;
        }
        System.out.println(name);
        Method1(name, n - 1);

    }
}

public class Print_Name_N_times{
    public static void main(String[] args) {
        Print_Name_N_times_methods.Method1("Venkat", 5);
    }
}