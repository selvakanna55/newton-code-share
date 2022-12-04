package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LogicalSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = -1;
        int k = arr[1] - arr[0];
        for (int i = 2; i < n; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff != k) { //
                ans = arr[i - 1] + k;
                break;
            }
        }
        System.out.println(ans);


    }
}

// 5
// 5 7 9 11 15

// k = arr[1]-arr[0]