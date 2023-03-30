package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ConstantNumberContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int digit = x % 10;

        boolean ans = true;

        while (x > 0) {
            int lastDigit = x % 10;
            if (lastDigit != digit) {
                ans = false;
                break;
            }
            x = x / 10;
        }
        System.out.println(ans);
    }
}