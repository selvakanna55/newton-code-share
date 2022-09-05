package Assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Donation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int money[] = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            money[i] = sc.nextInt();
            sum = sum + money[i];
        }

        int maxiPaid = money[0];
        for (int i = 0; i < n; i++) {
            int diff = maxiPaid - money[i];
            if (diff > 0) { // extra amount has to be paid
                System.out.print(diff + " ");
                sum = sum + diff;
            } else {
                System.out.print(0 + " ");
            }
            if (maxiPaid < money[i]) {
                maxiPaid = money[i];
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}