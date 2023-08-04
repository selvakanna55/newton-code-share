package arena;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

// sum of both arrays are same?
// by replaceing -1
// 1 -> -1
// 2 -> -1
// https://my.newtonschool.co/playground/code/hyqogxdm9602
class EqualizeAandB {

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int sum1 = 0, sum2 = 0;
        int negCount1 = 0, negCount2 = 0;

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            if (arr1[i] == -1) negCount1++;
            else sum1 = sum1 + arr1[i];
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
            if (arr2[i] == -1) negCount2++;
            else sum2 = sum2 + arr2[i];
        }
        int ans = 0;
        if (negCount1 == 1 && sum1 <= sum2) {
            ans = 1;
        } else if (negCount2 == 1 && sum1 >= sum2) {
            ans = 1;
        } else if (negCount1 == 2 && sum1 <= sum2) {
            ans = Math.abs(sum1 - sum2) + 1;
        } else if (negCount2 == 2 && sum1 >= sum2) {
            ans = Math.abs(sum1 - sum2) + 1;
        }

        System.out.println(ans);

    }

}