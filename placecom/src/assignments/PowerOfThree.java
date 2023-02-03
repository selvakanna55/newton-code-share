package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class PowerOfThree {
    static int k = 40;

    static long findPow3(long num, long pow[], long sumArray[]) {
        if (num <= 0) return 0;
        long ans = 0;
        for (int i = 0; i < k; i++) {
            if (sumArray[i] >= num) {
                ans = pow[i] + findPow3(num - pow[i], pow, sumArray);
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextInt();
        long pow[] = new long[k];
        long sumArray[] = new long[k];
        pow[0] = 1;
        sumArray[0] = 1;
        for (int i = 1; i < k; i++) {
            pow[i] = 3 * pow[i - 1];
            sumArray[i] = sumArray[i - 1] + pow[i];
        }
        // System.out.println(Arrays.toString(pow));
        // System.out.println(Arrays.toString(sumArray));
        while (T-- > 0) {
            long N = sc.nextLong();
            System.out.println(findPow3(N, pow, sumArray));
        }
    }
}
// given sum of powers of 3


