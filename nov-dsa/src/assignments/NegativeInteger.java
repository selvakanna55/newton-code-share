package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NegativeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean negative = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negative = true;
                break;
            }
        }
        if (negative) {
            System.out.println("Yes");
        } else {
            System.out.print("No");
        }
    }
}