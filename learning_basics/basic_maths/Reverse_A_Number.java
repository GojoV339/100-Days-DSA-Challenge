package learning_basics.basic_maths;

class Reverse_a_number_methods {
    public static int reverse_a_number_method1(int num) {
        int reverse_num = 0;

        while (num != 0) {
            int last_digit = num % 10;
            num = num / 10;

            if (reverse_num > Integer.MAX_VALUE / 10 ||
                (reverse_num == Integer.MAX_VALUE / 10 && last_digit > 7)) {
                return 0;
            }

            if (reverse_num < Integer.MIN_VALUE / 10 ||
                (reverse_num == Integer.MIN_VALUE / 10 && last_digit < -8)) {
                return 0;
            }

            reverse_num = reverse_num * 10 + last_digit;
        }
        return reverse_num;
    }
}

public class Reverse_A_Number {
    public static void main(String[] args) {
        System.out.println(
            Reverse_a_number_methods.reverse_a_number_method1(27365)
        );
    }
}
