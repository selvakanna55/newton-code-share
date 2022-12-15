package assignments;

public class ImplementingMergeSort {


    public static int[] implementMergeSort(int arr[], int start, int end) {
        // Your code here
        // You can have your own function where you will use
        // start and end position for divide purpose


        if (start < end) {
            int mid = (start + end) / 2;
            arr = implementMergeSort(arr, start, mid);
            arr = implementMergeSort(arr, mid + 1, end);
            merge(arr, start, end, mid);
        }
        return arr;
    }


    public static void merge(int arr[], int left, int right, int mid) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[left + i];
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = arr[mid + i + 1];
        }

        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            arr[k++] = arr1[i++];
        }

        while (j < n2) {
            arr[k++] = arr2[j++];
        }
    }
}