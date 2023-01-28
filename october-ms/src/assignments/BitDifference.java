package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class BitDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long mod = (long) (1e9) + 7;

        long pow2 = 1;
        long setBit[] = new long[32];
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < n; j++) {
                if ((pow2 & arr[j]) != 0) {
                    setBit[i]++;
                }
            }
            pow2 = pow2 * 2;
        }
        // System.out.println(Arrays.toString(setBit));

        // [1,2,3,4, 5]
        // 1st is set by 3 numbers, remaning number (2 -> (5-3))
        // 3*2 => 6 *2
        long ans = 0;
        for (int i = 0; i < 32; i++) {
            ans += (((setBit[i] * (n - setBit[i])) % mod) * (2)) % mod;
            ans = (ans) % mod;
        }
        System.out.println(ans);

    }
}