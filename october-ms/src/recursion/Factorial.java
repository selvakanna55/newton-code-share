package recursion;

public class Factorial {
    static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        int sum = num * factorial(num - 1);
        return sum;
    }

    public static void main(String[] args) {
        // sum -> n
//        int n = 5;
//        // 1+2+3+4+5
//        int fact = 1;
//        for (int i = 1; i <= n; i++) {
//            fact = fact * i;
//        }
//        System.out.println(fact);
        int sum = factorial(5);
        System.out.println(sum);
    }
}

