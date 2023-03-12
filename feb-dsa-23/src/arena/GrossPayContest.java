package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class GrossPayContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int basicPay = sc.nextInt();

            //for(int i=0; i<t; i++){
            if (basicPay < 1500) {
                double hra = 0.1;
                double result = hra * basicPay;
                double da = 0.9;
                double result1 = da * basicPay;
                double grossPay = basicPay + result + result1;
                System.out.printf("%.2f\n", grossPay);
            } else {
                int hra = 500;
                double da = 0.98;
                double result3 = da * basicPay;
                double grossPay = basicPay + hra + result3;
                System.out.printf("%.2f\n", grossPay);
            }
            //}
        }
    }
}