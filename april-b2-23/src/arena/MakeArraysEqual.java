package arena;

// https://my.newtonschool.co/playground/code/fx4m12cg2z9e

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MakeArraysEqual {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        String ans = "YES";

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(A[i] - B[i]);
            if (diff % 2 == 1) {
                ans = "NO";
                break;
            }
        }

        System.out.println(ans);
    }
}