package recursion;

public class Fibonacci {

    static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        int fibonacci = fib(n - 1) + fib(n - 2);
        return fibonacci;
    }

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}

