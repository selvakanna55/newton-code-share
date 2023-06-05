package sortings;

import java.util.Arrays;

public class MergeSort {

    static void megre(int arr[], int left, int right, int mid) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[left + i];
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = arr[i + mid + 1];
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

        // System.out.println(left+" "+right+" "+Arrays.toString(arr));

    }

    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);  //sort the left array
            mergeSort(arr, mid + 1, right); // sort the right array
            megre(arr, left, right, mid);
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 1, 3, 5};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

    }
}