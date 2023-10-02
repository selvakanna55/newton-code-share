package array;


import java.util.*;

class ArrayRotation {
    public static void rightRotate(int arr[]) {
        int n = arr.length;
        int temp = arr[n - 1];
        // for(int i=n-1;i>=1;i--){
        for (int i = 1; i <= n - 1; i++) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static void leftRotate(int arr[]) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    public static void main(String args[]) {
        int arr[] = {11, 12, 13, 14};
        System.out.println(Arrays.toString(arr));
        rightRotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}