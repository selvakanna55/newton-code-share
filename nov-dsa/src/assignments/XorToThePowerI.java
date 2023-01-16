package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class XorToThePowerI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int result = 0;

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            if (i % 2 == 1) {
                result = result ^ num;
            }
        }
        System.out.print(result);
    }
}