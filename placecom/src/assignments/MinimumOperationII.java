package assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
// https://my.newtonschool.co/playground/code/jy70io2dsmqc/
class MinimumOperationII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = 1, y = 1;
        long n = sc.nextInt();
        long count = 0;
        while (x < n && y < n) {
            if (x <= y) {
                x = x + y;
            } else {
                y = x + y;
            }
            count++;
        }
        if (n <= 100000) System.out.println(count);
        else System.out.println(count + 1);

    }
}
