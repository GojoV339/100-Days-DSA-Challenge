package learning_basics.basic_maths;

class Check_For_PrimeNumber_Methods{
    public static boolean isPrime_Method1(int num){ // O(n)
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }
        return count == 2;
    }

    public static boolean isPrime_Method2(int num){ // O(sqrt(n))
        int count = 0;
        for(int i = 1; i*i < num; i++){
            if(num % i == 0){
                count++;
                if((num / i) != i){
                    count++;
                }
            }
        }
        return count == 2;
    }
}

public class Check_For_PrimeNumber {
    public static void main(String[] args){
        System.out.println(Check_For_PrimeNumber_Methods.isPrime_Method1(23));
        System.out.println(Check_For_PrimeNumber_Methods.isPrime_Method2(23));

    }    
}
