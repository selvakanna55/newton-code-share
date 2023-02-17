package practice;

import java.util.Scanner;

public class ThreeConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= n - 3; i++) {
//            boolean found = true;
//            for (int j = i; j < i + 3; j++) {
//                if (arr[i] != arr[j]) {
//                    found = false;
//                    break;
//                }
//            }
//            if (found) {
//                for (int j = 0; j < 3; j++) {
//                    System.out.println(arr[i]);
//                }
//            }
            if (arr[i] == arr[i + 1] && arr[i + 1] == arr[i + 2]) {
                System.out.println(arr[i] + " " + arr[i] + " " + arr[i]);
            }
        }
    }
}
