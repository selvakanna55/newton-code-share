package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class LargestPrimeDivisor {
    static int printPrimeFactors(int n) {
        int ans = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                ans = Math.max(i, ans);
                n = n / i;
            }
        }
        ans = Math.max(n, ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printPrimeFactors(n));
    }
}