package learning_basics.basic_maths;

class GCD_or_HCF_methods{
    public static int GCD_or_HCF_method1(int n1,int n2){
        int gcd = 1;
        for(int i = 1; i <= Math.min(n1, n2); i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static int GCD_or_HCF_method2(int n1,int n2){
        int gcd = 1;
        for(int i = Math.min(n1,n2); i >= 1; i--){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
                break;
            }
        }
        return gcd;
    }
    

    public static int GCD_or_HCF_method_Euclidean_Algo_Subtraction(int n1, int n2){
        while(n1 > 0 && n2 > 0){
            if(n1 > n2){
                n1 = n1 % n2;
            }else{
                n2 = n2 % n1;
            }
        }
        if(n1 == 0){
            return n2;
        }else{
            return n1;
        }
    }

    public static int GCD_or_HCF_method_Euclidean_Algo_Modulo(int n1,int n2){
        while(n1 > 0 && n2 > 0){
            if(n1 > n2){
                n1 = n1 % n2;
            }else{
                n2 = n2 % n1;
            }
        }
        if(n1 == 0){
            return n2;
        }else{
            return n1;
        }
    }
}

public class GCD_or_HCF {
    public static void main(String[] args) {
        System.out.println(GCD_or_HCF_methods.GCD_or_HCF_method1(20, 15));
        System.out.println(GCD_or_HCF_methods.GCD_or_HCF_method2(15,20));
        System.out.println(GCD_or_HCF_methods.GCD_or_HCF_method_Euclidean_Algo_Subtraction(15, 20));
        System.out.println(GCD_or_HCF_methods.GCD_or_HCF_method_Euclidean_Algo_Modulo(20, 15));
    }
}
