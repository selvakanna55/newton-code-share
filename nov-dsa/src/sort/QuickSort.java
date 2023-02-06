package sort;

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class QuickSort {

    static void swap(int arr[], int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    static int getPartionIdx(int arr[], int left, int right) {
        int pivot = arr[right];
        int j = left;
        for (int i = left; i < right; i++) {
            if (arr[i] < pivot) {
                swap(arr, i, j);
                j++;
            }
        }
        swap(arr, j, right);
        return j;
    }

    static void quickSort(int arr[], int left, int right) {
        if (left < right) {
            int partionIdx = getPartionIdx(arr, left, right);
            quickSort(arr, left, partionIdx - 1);
            quickSort(arr, partionIdx + 1, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}