package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SuspenseString {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String ans = "";
            int i = 0;
            int j = n - 1;
            while (i <= j) {
                if (i <= j) {
                    char ch = s.charAt(i);
                    if (ch == '0') {
                        ans = '0' + ans;
                    } else {
                        ans = ans + 1;
                    }
                    i++;
                }
                if (i <= j) {
                    char ch = s.charAt(j);
                    if (ch == '0') {
                        ans = ans + '0';
                    } else {
                        ans = '1' + ans;
                    }
                    j--;
                }
            }
            System.out.println(ans);
        }
    }
}