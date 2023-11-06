package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int arr[]) {
        // TC: O(n^2), SC: O(1)
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // int arr[] = {10,4,6,2,3};
        int arr[] = {10, 3, 6, 2};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
