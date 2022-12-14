package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int arr[], int left, int right, int mid) {
        int n1 = mid - left + 1; // 5-4+1
        int n2 = right - mid; // 7-5

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            arr2[j] = arr[mid + j + 1];
        }

        // merge two sorted array
        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, right, mid);
        }
    }

    // SC: O(n)
    // TC: O(n logn)
    // logn -> divde
    // n -> merge
    public static void main(String[] args) {
        int arr[] = {7, 3, 12, 9, 11, 6};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}
