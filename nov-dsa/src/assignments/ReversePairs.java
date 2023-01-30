package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class ReversePairs {
    static long count = 0;

    static void merge(int arr[], int left, int right, int mid) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            arr2[j] = arr[mid + 1 + j];
        }

        int j = 0;
        for (int i = 0; i < n1; i++) {
            while (j < n2 && arr1[i] > 2 * arr2[j]) {
                j++;
            }
            count = count + j;
        }


        int i = 0, k = left;
        j = 0;
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

    static void mergeSort(int arr[], int left, int right) { // merge
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid); // sort the left array
            mergeSort(arr, mid + 1, right); // sort right array
            merge(arr, left, right, mid);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n - 1);
        System.out.println(count);
    }
}