package batch_assignments;

public class ImplementingMergeSort {

    public static int[] implementMergeSort(int arr[], int start, int end) {
        mergeSort(arr, start, end);
        return arr;
    }

    static void merge(int arr[], int st, int end, int mid) {
        int n1 = mid - st + 1;
        int n2 = end - mid;

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        // copy left half into dummy array
        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[st + i];
        }
        // copy right half into dummy array
        for (int j = 0; j < n2; j++) {
            arr2[j] = arr[mid + j + 1];
        }

        // merge two sorted array arr
        int i = 0, j = 0, k = st;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k++] = arr1[i++];
        }
        while (j < n2) {
            arr[k++] = arr2[j++];
        }

    }

    static void mergeSort(int arr[], int st, int end) {
        if (st >= end) { // base cond
            return;
        }
        int mid = (end + st) / 2;
        mergeSort(arr, st, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, st, end, mid);
    }
}