package Assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RMSOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum = sum + (num * num);
        }
        double mean = (double) sum / n;
        double sqrt = Math.sqrt(mean);
        System.out.printf("%.6f", sqrt);
    }
}