package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MaximizeStrengthContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rem[] = new int[k];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            rem[i % k] = Math.max(rem[i % k], num);
        }
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += rem[i];
        }
        System.out.println(sum);
    }
}