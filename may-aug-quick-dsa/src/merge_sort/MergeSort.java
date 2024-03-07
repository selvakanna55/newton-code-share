package merge_sort;

import java.util.Arrays;

public class MergeSort {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    static void mergeTwoSorted(int arr1[], int arr2[]) {
        int n1 = arr1.length, n2 = arr2.length;
        int res[] = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
            } else {
                res[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            res[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            res[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(res));
    }

    static void merge(int arr[], int left, int right, int mid) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0, k = left;
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

    static void mergeSort(int arr[], int left, int right) {
        if (left == right) { // >= is needed?
            return; // that array is already sorted
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid); // get the left sorted array
        mergeSort(arr, mid + 1, right); // get right sorted array
        merge(arr, left, right, mid);
    }

    public static void main(String[] args) {
        // int arr[] = {10, 9, 8, 7, 6, 1, -3};
        int arr[] = {19, 1, 9, 6, 5, 3, 10};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}