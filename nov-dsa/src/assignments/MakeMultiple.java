package assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MakeMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int a = 1; a <= T; a++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int result = 0;
            if (B % A == 0 || B - A >= A) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}