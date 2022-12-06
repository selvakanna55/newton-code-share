package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSortArray(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int val = arr[i];
            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }
    }

    public static void main(String[] args) {
        int arr[] = {7, 9, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
        insertionSortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
