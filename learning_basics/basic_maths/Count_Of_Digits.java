package learning_basics.basic_maths;
class Methods{
    public static int count_digits_method1(int num){
        int count = 0;
        while(num > 0){
            count = count + 1;
            num = num / 10;
        }
        return count;
    }

    public static int count_digits_method2(int num){
        int count = (int)(Math.log10(num));
        return count + 1;
    }
}

public class Count_Of_Digits {
    public static void main(String[] args){
        System.out.println(Methods.count_digits_method1(10756));
        System.out.println(Methods.count_digits_method2(10756));
    }
}
