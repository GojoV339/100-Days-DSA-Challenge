package learning_basics.lec_2_build_up_logical_thinking;

class Patterns {
    public static void Pattern1(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j ++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern2(){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern3(){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern4(){
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern5(){
        for(int i = 1; i <= 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern6(){
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern7(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            for(int j = 0; j < n - i - 1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Pattern8(int n){
        for(int i = 4; i >= 0; i--){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern9(int n){
        Pattern7(n);
        Pattern8(n);
    }

    public static void Pattern10(int n) {
        for (int i = 0; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern11(int n) {
        int start = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                start = 0;
            } else {
                start = 1;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }  

    public static void Pattern12(int n){
        int space = 2 * (n - 1);
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    public static void Pattern13(int n){
        int num = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }

    public static void Pattern14(int n){
        for(int i = 1; i <= n; i++){
            for(char ch = 'A'; ch < 'A' + i;ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern15(int n){
        for(int i = 5; i>= 0; i--){
            for(char ch = 'A'; ch < 'A' + i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern16(int n){
        char ch = 'A';
        for(int i = 0; i < n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
            ch += 1;
        }
    }

    public static void Pattern17(int n){
        for(int i = 0; i < n;i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }

            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j = 1; j<=2*i + 1;j++){
                System.out.print(ch);
                if(j <= breakpoint){
                    ch++;
                }else{
                    ch--;
                }
            }

            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Pattern18(int n){
        for(int i = 0; i < n; i++){
            for(char ch = (char) ('E' - i); ch <= 'E'; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern19(int n){
        int iniS = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print("*");
            }

            for(int j = 0; j < iniS; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            iniS += 2;
            System.out.println();
        }

        iniS = 2*n - 2;
        for(int i = 1;i <= n;i++){
            for(int j = 1; j <= i;j++){
                System.out.print("*");
            }
            
            for(int j = 0;j < iniS;j++){
                System.out.print(" ");
            }
            
            for(int j = 1; j <= i;j++){
                System.out.print("*");
            }
            iniS -= 2;
            System.out.println();
        }
    }

    public static void Pattern20(int n){
        int spaces = 2*n - 2;
        for(int i = 1; i <= 2*n - 1;i++){
            int stars = i;
            if(i > n){
                stars = 2*n - i;
            }
            // stars
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            //spaces
            for(int j = 1; j<= spaces;j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i < n){
                spaces -= 2;
            }else{
                spaces += 2;
            }
        }
    }

    public static void Pattern21(int n){
        for(int i = 0; i<n;i++){
            for(int j = 0; j < n;j++){
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Pattern22(int n){
        for(int i = 0; i < 2 * n - 1; i++){
            for(int j = 0; j < 2 * n - 1; j++){
                int top = i;
                int bottom = j;
                int right = (2*n - 2) - j;
                int left = (2*n - 2) - i;

                System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
            }
            System.out.println();
        }
    }
}


public class Main{
    public static void main(String[] args) {
        Patterns.Pattern1();
        Patterns.Pattern2();
        Patterns.Pattern3();
        Patterns.Pattern4();
        Patterns.Pattern5();
        Patterns.Pattern6();
        Patterns.Pattern7(5);
        Patterns.Pattern8(5);
        Patterns.Pattern9(5);
        Patterns.Pattern10(5);
        Patterns.Pattern11(5);
        Patterns.Pattern12(5);
        Patterns.Pattern13(5);
        Patterns.Pattern14(5);
        Patterns.Pattern15(5);
        Patterns.Pattern16(5);
        Patterns.Pattern17(5);
        Patterns.Pattern18(5);
        Patterns.Pattern19(5);
        Patterns.Pattern20(5);
        Patterns.Pattern21(5);
        Patterns.Pattern22(5);
    }
}
