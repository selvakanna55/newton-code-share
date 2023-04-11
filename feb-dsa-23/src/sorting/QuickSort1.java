package sorting;

import java.util.Arrays;

public class QuickSort1 {
    static int getPivotIndex(int arr[], int left, int right) {
        int pivot = arr[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        int temp = arr[right];
        arr[right] = arr[i];
        arr[i] = temp;
        return i;
    }

    static void quickSort(int arr[], int left, int right) {
        if (left < right) {
            int pivotIndex = getPivotIndex(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    public static void main(String[] args) {
        int arr[] = {15, 10, 3, 7};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

    }
}
