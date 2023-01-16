package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class FindBadNumber {
    static boolean isPowerOfX(int num, int x) {
        while (num > 1) {
            if (num % x != 0) {
                return false;
            }
            num = num / x;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (!isPowerOfX(num, x)) {
                System.out.println(num);
                break;
            }
        }
    }
}