package assignments;


import java.util.*;

public class SequenceFormationContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + Math.abs(a[i]);
        }
        System.out.println(sum);
    }
}