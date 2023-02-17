package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class IncreasingDigitsContest {
    static boolean isIncreasing(int num) {
        int prev = 10;
        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            if (lastDigit >= prev) {
                return false;
            }
            prev = lastDigit;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (isIncreasing(i)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}