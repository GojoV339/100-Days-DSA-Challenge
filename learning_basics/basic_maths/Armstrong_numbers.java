package learning_basics.basic_maths;

class Armstrong_numbers_methods{
    public static boolean Armstrong_numbers_method1(int num){

        if(num < 0){
            return false;
        }

        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while(num != 0){
            int last_digit = num % 10;
            sum = sum + (int) Math.pow(last_digit, digits);
            num = num / 10;
        }

        return original == sum;
    }
}

public class Armstrong_numbers {
    public static void main(String[] args) {
        System.out.println(Armstrong_numbers_methods.Armstrong_numbers_method1(1634));
        System.out.println(Armstrong_numbers_methods.Armstrong_numbers_method1(371));
        System.out.println(Armstrong_numbers_methods.Armstrong_numbers_method1(12345));

    }
}
