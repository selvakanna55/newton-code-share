package modulo;

import java.util.Arrays;

public class QuickSort {


    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int arr[], int left, int right) {
//        int len = right - left;
//        if (len <= 0) return;
        if (left < right) {
            int idx = getPartitionIndex(arr, left, right);
            quickSort(arr, left, idx - 1);
            quickSort(arr, idx + 1, right);
        }
    }

    static int getPartitionIndex(int[] arr, int left, int right) {
        int j = left;
        for (int i = left; i <= right - 1; i++) {
            if (arr[i] < arr[right]) {
                swap(arr, i, j);
                j++;
            }
        }
        swap(arr, right, j);
        return j;
    }

    public static void main(String[] args) {
//        int arr[] = {10, 9, 8, 7, 6};
        int arr[] = {10, 5, 1, 2, 6, 12, 15, 7};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

//best -> O(nlogn)
// avg -> O(nlogn)
// worst -> O(n2)