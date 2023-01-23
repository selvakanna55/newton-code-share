package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ModSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = arr[n - 2];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[n - 1]) {
                ans = arr[i];
                break;
            }
        }
        System.out.println(ans);
    }
}