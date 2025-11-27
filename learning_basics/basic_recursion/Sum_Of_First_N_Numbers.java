package learning_basics.basic_recursion;

class Sum_Of_First_N_Numbers_Methods{
    public static int Sum_Of_Frist_N_Numbers_Method1(int n){

        // base case 
        if(n == 1){
            return 1;
        }

        int temp = Sum_Of_Frist_N_Numbers_Method1(n - 1);
        return temp + n;
    }
}


public class Sum_Of_First_N_Numbers {
    public static void main(String[] args){
        System.out.println(Sum_Of_First_N_Numbers_Methods.Sum_Of_Frist_N_Numbers_Method1(10));  
    }
}
