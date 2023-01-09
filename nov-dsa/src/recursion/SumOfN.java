package recursion;

public class SumOfN {


//    static void sumOfNNatural(int num, int n, int sum) {
//        if (num > n) {
//            System.out.println(sum);
//            return;
//        }
//        sum = sum + num;
//        sumOfNNatural(num + 1, n, sum);
//    }

    static int sumOfNNatural(int num, int n) {
        if (num > n) {
            return 0;
        }
        int sum = num;
        sum = sum + sumOfNNatural(num + 1, n);
        return sum;
    }

    static void chintu(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
//        int sum = sumOfNNatural(1, 3);
        chintu(10, 20);
    }
}
