package learning_basics.basic_maths;

class Palindrome_Methods {
    public static boolean Palindrome_method1(int num) {
        if (num < 0) {
            return false;
        }

        int reverse_num = 0;
        int original = num;

        while (num != 0) {
            int last_digit = num % 10;
            num = num / 10;

            if (reverse_num > Integer.MAX_VALUE / 10 ||
               (reverse_num == Integer.MAX_VALUE / 10 && last_digit > 7)) {
                return false;
            }

            reverse_num = reverse_num * 10 + last_digit;
        }

        return reverse_num == original;
    }
}

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(Palindrome_Methods.Palindrome_method1(64));    // false
        System.out.println(Palindrome_Methods.Palindrome_method1(121));   // true
        System.out.println(Palindrome_Methods.Palindrome_method1(-121));  // false
    }
}
