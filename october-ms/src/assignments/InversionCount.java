package assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class InversionCount {

    static long count = 0;

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
            if (arr1[i] <= arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                count = count + (mid + j + 1) - k;
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

    public static void sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, right, mid);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, 0, n - 1);

        System.out.print(count);

    }
}