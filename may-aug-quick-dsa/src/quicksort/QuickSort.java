package quicksort;

import java.util.*;

public class QuickSort {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    static void swap(int arr[], int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static int getPivotIndex(int arr[], int left, int right) { // O(n)
        // swap(arr, (left+right)/2, right); // logic to use any value as pivotIdx
        int pivotIdx = right;
        int j = left;
        for (int i = left; i <= right; i++) {
            if (i == pivotIdx) continue; //ignore pivotIdx;
            if (arr[i] < arr[pivotIdx]) {
                swap(arr, i, j);
                j++;
            }
        }
        swap(arr, pivotIdx, j);
        return j;
    }

    static void quickSort(int arr[], int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotIdx = getPivotIndex(arr, left, right);
        System.out.println(left + " " + right + " " + pivotIdx + " " + Arrays.toString(arr));
        quickSort(arr, left, pivotIdx - 1);
        quickSort(arr, pivotIdx + 1, right);
    }

    public static void main(String[] args) {
        // int arr[] = {8,7,2,1,0,9,6};
        int arr[] = {1, 3, 2, 6, 5, 7, 4};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}