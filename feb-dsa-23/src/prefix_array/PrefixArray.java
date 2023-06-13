package prefix_array;


import java.util.Arrays;
import java.util.Scanner;

public class PrefixArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int prefix[] = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = arr[i] + prefix[i];
        }
        System.out.println(Arrays.toString(prefix));

        int t = sc.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            // int sum = 0;
            // for(int i=left;i<=right;i++){
            //     sum = sum + arr[i];
            // }
            int sum = prefix[right + 1] - prefix[left];
            System.out.println(sum);
        }
    }
}