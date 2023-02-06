package assignments;


import java.util.Arrays;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MakeEverythingEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int middle = arr[n / 2];
        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans = ans + Math.abs(arr[i] - middle);
        }
        System.out.println(ans);
    }
}