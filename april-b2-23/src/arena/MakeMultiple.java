package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MakeMultiple {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // int x = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (B % A == 0) {
                System.out.println("YES");
            } else if (B - A >= A) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}