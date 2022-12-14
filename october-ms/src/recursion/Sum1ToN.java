package recursion;

public class Sum1ToN {
    static int sumOfN(int num) {
        System.out.println(num);
        if (num > 1000) { // condition - base condition
            return 0;
        }
        int sum = num + sumOfN(num - 1);
        return sum;
    }

    public static void main(String[] args) {
        // sum -> n
//        int n = 10;
////        // 1+2+3+4+5
//        int sum = 0;
//        for (int i = 1; i > 0; i++) {
//            System.out.println(i);
//            sum = sum + i;
//        }
//        System.out.println(sum);
        int sum = sumOfN(5);
        System.out.println(sum);
    }
}

