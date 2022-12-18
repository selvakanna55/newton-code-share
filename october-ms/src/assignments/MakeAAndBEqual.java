package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MakeAAndBEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            while (a % 2 == 0) {
                a = a / 2;
            }

            while (b % 2 == 0) {
                b = b / 2;
            }
            if (a == b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}