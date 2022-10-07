package batch_assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class InversionCount {
    static long merge(long arr[], int st, int end, int mid) {
        long inversionCount = 0;

        int n1 = mid - st + 1;
        int n2 = end - mid;

        long arr1[] = new long[n1];
        long arr2[] = new long[n2];

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
                inversionCount += (n1 - i);
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
        return inversionCount;
    }

    static long mergeSort(long arr[], int st, int end) {
        long inversionCount = 0;
        if (st >= end) { // base cond
            return 0;
        }
        int mid = (end + st) / 2;
        inversionCount += mergeSort(arr, st, mid);
        inversionCount += mergeSort(arr, mid + 1, end);
        inversionCount += merge(arr, st, end, mid);
        return inversionCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(mergeSort(arr, 0, n - 1));

    }
}