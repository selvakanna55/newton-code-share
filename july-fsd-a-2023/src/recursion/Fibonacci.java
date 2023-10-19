package recursion;


class Fibonacci {

    public static int fibnoncci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        int left = fibnoncci(n - 1);
        int right = fibnoncci(n - 2);
        return left + right;
    }

    public static void main(String args[]) {
        System.out.println(fibnoncci(1));
        System.out.println(fibnoncci(2));
        System.out.println(fibnoncci(3));
        System.out.println(fibnoncci(4));
    }
}



