package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DifferenceOperations {
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        boolean x = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] % arr[0] != 0) {
                x = false;
            }
        }


        if (x == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}