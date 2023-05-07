package leetcode;


import java.util.*;

class RotateArrayBy1 {
    public static void main(String args[]) {
        int arr[] = {10, 12, 14, 16, 18};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));

        //rotate array by 1
        int temp = arr[n - 1];
        for (int i = n - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        //compare -> two array n


        System.out.println(Arrays.toString(arr));
    }
}