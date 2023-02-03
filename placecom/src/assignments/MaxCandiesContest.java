package assignments;


import java.util.Scanner;

class MaxCandiesContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[i] = sc.nextInt();
        }
        n--;


        long sum = 0;
        sum = b[0] + b[n - 1];
        for (int i = 1; i < n; i++) {
            sum = sum + Math.min(b[i], b[i - 1]);
        }
        System.out.print(sum);
    }
}