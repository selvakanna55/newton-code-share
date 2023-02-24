package contest2;

import java.util.Scanner;

public class CalculateSalary {
    public static void main(String[] args) {
        /*
         calculate salary
         rule1: base pay < 1500, hra - 10% of base, DA 90% of base
         rule2: base pay >=1500, hra 500         , DA 98% of base

         given base pay, find salary upto decimal
         input:
            2
            400
            1600

            output:
            800
            3540

         */
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int basePay = sc.nextInt();
            double ans;
            if (basePay < 1500) {
                ans = basePay + (basePay * 0.1) + (basePay * 0.9);
            } else {
                ans = basePay + 500 + (basePay * 0.98);
            }
            System.out.printf("%.2f", ans);
        }

    }
}
