package sortings;

import java.util.Arrays;

public class QuickSort {


    public static int partition(int arr[], int left, int right) {
        int i = left;
        int pivot = arr[right];
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) { // swap i and j
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        // swap i and right
        int temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;
        return i;
    }

    public static void quickSort(int arr[], int left, int right) {
        if (left < right) { //atleast one element is needed
            int pivotIdx = partition(arr, left, right);
            quickSort(arr, left, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, right);
        }
    }

    public static void main(String args[]) {
        int arr[] = {3, 7, 2, 8, 4};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}