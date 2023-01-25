package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MaxMinAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long n = scan.nextLong();

        for (long i = 0; i < n; i++) {
            long tempMax = 0;
            long tempMin = a;
            long mod = 0;
            long num = a;
            while (num > 0) {
                mod = num % 10;
                if (mod > tempMax) {
                    tempMax = mod;
                }
                if (mod < tempMin) {
                    tempMin = mod;
                }
                num = num / 10;
            }
            long x = (tempMax * tempMin);
            a = a + x;
            if (x == 0) break;
        }
        System.out.println(a);
    }
}