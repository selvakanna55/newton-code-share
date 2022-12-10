package sorting;

import java.util.Arrays;

public class QuickSort {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int getPartitionIndex(int arr[], int left, int right) {
        int pivotIndex = right; // use any
        int i = left;
        for (int j = left; j <= right - 1; j++) {
            if (arr[j] < arr[pivotIndex]) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, pivotIndex);
        return i;
    }

    public static void quickSortArray(int arr[], int left, int right) {
        if (left < right) { //minimum 1 element is needed
            int partIdx = getPartitionIndex(arr, left, right);
            quickSortArray(arr, left, partIdx - 1);
            quickSortArray(arr, partIdx + 1, right);
        }
    }


    public static void main(String[] args) {
        int arr[] = {10, 9, 8, 18, 29, -8};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        quickSortArray(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}
