package array;


import java.util.*;

class MoveNegativeToEnd {

    public static void moveNegativeToEnd(int arr[]) {
        int n = arr.length;

        int ans[] = new int[n];
        int j = 0;

        // positive
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) { //positive
                ans[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) { //negative
                ans[j] = arr[i];
                j++;
            }
        }

        // copy from ans to arr
        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
    }

    public static void main(String args[]) {
        int arr[] = {10, -14, 6, -21, 3};
        System.out.println(Arrays.toString(arr));
        moveNegativeToEnd(arr); // move all negative numbers to the end of the array, without modifying the order
        System.out.println(Arrays.toString(arr));

    }
}


// int arr[] = {10,14,-6,21,3,-9,-31,-1,4,6};