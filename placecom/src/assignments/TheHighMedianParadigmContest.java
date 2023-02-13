package assignments;


import java.util.Scanner;

public class TheHighMedianParadigmContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum = sc.nextInt();
        long left = 0, right = sum + 1;
        long half = n / 2 + 1;
        long ans = 0;
        while (right - left > 1) {
            long mid = left + (right - left) / 2;
            if (half * mid <= sum) {
                left = mid;
                ans = mid;
            } else {
                right = mid;
            }
        }
        System.out.println(ans);
    }
}