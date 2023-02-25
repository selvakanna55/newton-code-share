package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SuspenseString {
    public static void main(String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            int i = 0, j = n - 1;
            while (i <= j) {
                if (s.charAt(i) == '0') sb.insert(0, '0');
                else sb.append('1');
                ++i;

                if (i <= j) {
                    if (s.charAt(j) == '0') sb.append('0');
                    else sb.insert(0, '1');
                    --j;
                }
            }
            System.out.println(sb);
        }
    }
}